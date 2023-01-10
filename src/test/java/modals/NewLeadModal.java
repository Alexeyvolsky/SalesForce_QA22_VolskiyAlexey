package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NewLeadModal extends BaseModal{
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(String firstName, String lastName, String company, int phone, String title, String email, String website,
                         String city, String state, int zipCode, String country, int employees, int annualRevenue, String street,
                         String description, String leadStatus, String rating, String leadSource, String industry){
        new Input(driver,"firstName").setValue(firstName);
        new Input(driver,"lastName").setValue(lastName);
        new Input(driver,"Company").setValue(company);
        new Input(driver,"Phone").setValue(String.valueOf(phone));
        new Input(driver,"Title").setValue(title);
        new Input(driver,"Email").setValue(email);
        new Input(driver,"Website").setValue(website);
        new Input(driver,"city").setValue(city);
        new Input(driver,"province").setValue(state);
        new Input(driver,"postalCode").setValue(String.valueOf(zipCode));
        new Input(driver,"country").setValue(country);
        new Input(driver,"NumberOfEmployees").setValue(String.valueOf(employees));
        new Input(driver,"AnnualRevenue").setValue(String.valueOf(annualRevenue));
        new TextArea(driver,"255").setTextareaText(street);
        new TextArea(driver,"32000").setTextareaText(description);
        new Dropdown(driver, "Lead Status").selectByVisibleText(leadStatus);
        new Dropdown(driver, "Rating").selectByVisibleText(rating);
        new Dropdown(driver, "Lead Source").selectByVisibleText(leadSource);
        new Dropdown(driver, "Industry").selectByVisibleText(industry);





    }
}
