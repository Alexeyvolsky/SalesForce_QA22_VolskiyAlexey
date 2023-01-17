package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModal extends BasePage {
    private final static By SAVE_BUTTON = By.xpath("//*[@title='Save']");


    public BaseModal(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
