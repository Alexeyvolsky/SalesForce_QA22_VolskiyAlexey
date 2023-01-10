package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage{
    private final static By DETAILS_BUTTON = By.xpath("//*[@class='slds-tabs_default__link' and @data-label='Details']");
    private final static By GET_EMAIL = By.xpath("//*[@class='emailuiFormattedEmail']");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }
    public String getEmail(){
        return driver.findElement(GET_EMAIL).getText();
    }
}
