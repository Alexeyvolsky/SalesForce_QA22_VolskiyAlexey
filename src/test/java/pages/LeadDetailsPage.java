package pages;

import elements.RecordLayoutItem;
import enums.Industry;
import enums.LeadSource;
import enums.LeadStatus;
import enums.Rating;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage{
    private final static By DETAILS_BUTTON = By.xpath("//*[@class='slds-tabs_default__link' and @data-label='Details']");
    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }
    public Lead getLeadDetails(){
        Lead.LeadBuilder lead = new Lead.LeadBuilder();
        lead.setFullName(new RecordLayoutItem(driver,"Name").getDetails());
        lead.setCompany(new RecordLayoutItem(driver,"Company").getDetails());
        lead.setTitle(new RecordLayoutItem(driver,"Title").getDetails());
        lead.setLeadStatus(LeadStatus.fromString("New"));
        lead.setPhone(new RecordLayoutItem(driver,"Phone").getDetails());
        lead.setEmail(new RecordLayoutItem(driver,"Email").getDetails());
        lead.setRating(Rating.fromString("Hot"));
        lead.setWebsite(new RecordLayoutItem(driver,"Website").getDetails());
        lead.setNumberOfEmployees(new RecordLayoutItem(driver,"No. of Employees").getDetails());
        lead.setAnnualRevenue(new RecordLayoutItem(driver,"Annual Revenue").getDetails());
        lead.setDescription(new RecordLayoutItem(driver,"Description").getDetails());
        lead.setLeadSource(LeadSource.fromString("Other"));
        lead.setIndustry(Industry.fromString("Banking"));
        return lead.build();
    }

}
