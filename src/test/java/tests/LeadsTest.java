package tests;

import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeadsTest extends BaseTest {
    @Test(dataProvider = "newLead")
    public void leadsTest(Lead lead) {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        newLeadModal.fillForm(lead);
        baseModal.clickSaveButton();
        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);
    }
    @DataProvider(name = "newLead")
    public Object[][] newLeadTestData(){
        return new Object[][]{
                { new Lead.LeadBuilder().setFirstName("Alexey").setLastName("Volskiy").setCompany("QA22").
                        setPhone("7788").setTitle("QA Engineer").setEmail("aleksvolsky@gmail.com").setWebsite("google.com").
                        setNumberOfEmployees("7").setAnnualRevenue("$10,000").setDescription("Good employee")
                        .setLeadStatus(LeadStatus.NEW).setRating(Rating.HOT).setLeadSource(LeadSource.OTHER).setIndustry(Industry.BANKING)
                        .setCity("Minsk").setProvince("Belarus").setPostalCode("220095").
                        setCountry("MinskCity").setStreet("Yakubova").setSalutation(Salutation.MR).build() },
        { new Lead.LeadBuilder().setLastName("Volski").setCompany("QA22").
                setPhone("7788").setTitle("QA Engineer").setEmail("aleksvolsky@gmail.com").setWebsite("google.com").
                setNumberOfEmployees("7").setAnnualRevenue("$10,000").setDescription("Good employee")
                .setLeadStatus(LeadStatus.NEW).setRating(Rating.HOT).setLeadSource(LeadSource.OTHER).setIndustry(Industry.BANKING)
                .setCity("Minsk").setProvince("Belarus").setPostalCode("220095").
                setCountry("MinskCity").setStreet("Yakubova").setSalutation(Salutation.MR).build() },
        { new Lead.LeadBuilder().setFirstName("Alexandr").setLastName("Volski").setCompany("QA22").
                setPhone("7788").setTitle("QA Engineer").setEmail("aleksvolsky@gmail.com").setWebsite("google.com").
                setNumberOfEmployees("7").setAnnualRevenue("$10,000").setDescription("Good employee")
                .setLeadStatus(LeadStatus.NEW).setRating(Rating.HOT).setLeadSource(LeadSource.OTHER).setIndustry(Industry.BANKING)
                .setCity("Minsk").setProvince("Belarus").setPostalCode("220095").
                setCountry("MinskCity").setStreet("Yakubova").build()}
        };
    }

}
