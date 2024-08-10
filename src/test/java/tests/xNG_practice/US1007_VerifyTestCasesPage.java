package tests.xNG_practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;

public class US1007_VerifyTestCasesPage {
    //Features: US1007 User will be able to see the main page of automationecercise.com

    //Scenario :TC1007 Verify Test Cases Page
@Test
    public void TC07(){
        AutomationExcercise automationExcercise= new AutomationExcercise();

        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        automationExcercise.logoElementi.isDisplayed();
        //4. Click on 'Test Cases' button
        automationExcercise.testcaseLoginButton.click();
        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(automationExcercise.testCaseTitle.isDisplayed());
        Driver.getDriver().quit();
    }
}
