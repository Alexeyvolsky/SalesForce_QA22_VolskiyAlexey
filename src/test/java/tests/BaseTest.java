package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.BaseModal;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected final static String BASE_URL = "https://qa229.lightning.force.com/lightning/page/home";
    protected final static String USERNAME = "aleksvolsky-bth3@force.com";
    protected final static String PASSWORD = "Alex1862123";
    protected WebDriver driver;
    protected LeadsPage leadsPage;
    protected LeadDetailsPage leadDetailsPage;
    protected NewLeadModal newLeadModal;
    protected HomePage homePage;
    protected EntityBasePage entityBasePage;
    protected LoginPage loginPage;
    protected BaseModal baseModal;
    @BeforeClass(alwaysRun = true)
    public void SetUp(ITestContext testContext){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        entityBasePage = new EntityBasePage(driver);
        leadsPage = new LeadsPage(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        baseModal = new BaseModal(driver);
    }
    @BeforeMethod(alwaysRun = true)
    public void navigate(){
        driver.get(BASE_URL);
    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
