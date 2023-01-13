package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecordLayoutItem extends BaseElement{
    private String label;
    private final static String GET_TEXT_LOCATOR ="//*[contains(@class, 'slds-show')]//span[text()='%s']/ancestor::records-record-layout-item//*[@data-output-element-id='output-field']";
    public RecordLayoutItem(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }
    public String getDetails(){
        WebElement details = driver.findElement(By.xpath(String.format(GET_TEXT_LOCATOR,this.label)));
        scrollIntoView(details);
        return details.getText();
    }
}
