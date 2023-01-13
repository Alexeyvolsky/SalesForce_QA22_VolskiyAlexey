package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown extends BaseElement{
    private String label;
    private final static String BUTTON_LOCATOR = "//label[text()='%s']/following-sibling::div//button";
    private final static String COMBOBOX_LOCATOR = "//*[@class='slds-truncate' and text()='%s']";
    public Dropdown(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }
    public void selectByVisibleText(String optionName){
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR,this.label)));
        scrollIntoView(dropdownButton);
        dropdownButton.click();
        WebElement option = driver.findElement(By.xpath(String.format(COMBOBOX_LOCATOR, optionName)));
        option.click();

    }
}