package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElement{
    private String name;
    private final static String TEXTAREA_LOCATOR = "//textarea[@maxlength='%s']";
    public TextArea(WebDriver driver,String name) {
        super(driver);
        this.name = name;
    }
    public void setTextareaText(String text){
        WebElement input = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR,this.name)));
        scrollIntoView(input);
        input.sendKeys(text);
    }
}
