package tests;

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
        newLeadModal.fillForm("Alexey","Volskiy", "QA22", 7788, "QA Engineer",
                "aleksvolsky@gmail.com", "google.com", "Minsk", "Belartus", 220095, "MinskCity",
                7, 10000, "Yakubova","Good employee","Contacted","Hot",
                "Other", "Banking");
        baseModal.clickSaveButton();
        String email = "aleksvolsky@gmail.com";
        Assert.assertEquals(leadDetailsPage.getEmail(),email);
    }

}
