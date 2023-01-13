package tests;

import enums.Industry;
import enums.LeadSource;
import enums.LeadStatus;
import enums.Rating;
import models.Lead;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTest extends BaseTest{
    @Test
    public void leadsTest(){
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        Lead testlead = new Lead.LeadBuilder().setFirstName("Alexey").setLastName("Volskiy").setCompany("QA22").
                setPhone("7788").setTitle("QA Engineer").setEmail("aleksvolsky@gmail.com").setWebsite("google.com").
                setNumberOfEmployees("7").setAnnualRevenue("$10,000").setDescription("Good employee")
                .setLeadStatus(LeadStatus.NEW).setRating(Rating.HOT).setLeadSource(LeadSource.OTHER).setIndustry(Industry.BANKING)
                .setFullName("Alexey Volskiy").build();
        newLeadModal.fillForm(testlead);
        baseModal.clickSaveButton();
        Assert.assertEquals(leadDetailsPage.getLeadDetails(),testlead);
    }

}
