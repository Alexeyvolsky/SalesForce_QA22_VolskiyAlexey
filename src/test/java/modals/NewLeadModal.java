package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import io.qameta.allure.Description;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NewLeadModal extends BaseModal{
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(Lead lead){
        new Input(driver,"firstName").setValue(lead.getFirstName());
        new Input(driver,"lastName").setValue(lead.getLastName());
        new Input(driver,"Company").setValue(lead.getCompany());
        new Input(driver,"Phone").setValue(lead.getPhone());
        new Input(driver,"Title").setValue(lead.getTitle());
        new Input(driver,"Email").setValue(lead.getEmail());
        new Input(driver,"Website").setValue(lead.getWebsite());
//        new Input(driver,"city").setValue(lead.getCity());
//        new Input(driver,"province").setValue(lead.getProvince());
//        new Input(driver,"postalCode").setValue(lead.getPostalCode());
//        new Input(driver,"country").setValue(lead.getCountry());
//        new TextArea(driver,"255").setTextareaText(lead.getStreet());
        new Input(driver,"NumberOfEmployees").setValue(lead.getNumberOfEmployees());
        new Input(driver,"AnnualRevenue").setValue(lead.getAnnualRevenue());
        new TextArea(driver,"32000").setTextareaText(lead.getDescription());
        new Dropdown(driver, "Lead Status").selectByVisibleText(lead.getLeadStatus().getName());
        new Dropdown(driver, "Rating").selectByVisibleText(lead.getRating().getName());
        new Dropdown(driver, "Lead Source").selectByVisibleText(lead.getLeadSource().getName());
        new Dropdown(driver, "Industry").selectByVisibleText(lead.getIndustry().getName());





    }
}
