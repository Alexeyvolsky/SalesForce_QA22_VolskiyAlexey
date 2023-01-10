package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final static By userNameInput = By.id("username");
    private final static By passwordInput = By.id("password");
    private final static By loginButton = By.id("Login");

    public LoginPage(WebDriver driver) {super(driver);}
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void setUserName(String userName){
        driver.findElement(userNameInput).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
}
