package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;

public class TC4_LogoutUser  extends TestBaseCross {
    @Test
    public void TC4(){
        //extentTest=extentReports.createTest("US1004 User Logout testi",
        //   "User'in basarili bi sekilde cikis yapmasi test edilir");
        AutomationExcercise automationExcercise=new AutomationExcercise();
        //1. Launch browser
       // extentTest.pass("Web browser acilir");
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //extentTest.pass("Test sayfasina gidilir");
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        // extentTest.pass("Logo elementi gorunun testi ");

        //4. Click on 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        //extentTest.info("Signup/Login link'ine user tikladi");

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationExcercise.logintoyouraccountEmailBoxElementi.
                isDisplayed());
        // extentTest.info("Login to your account sayfasi gorunur mu test edildi");
        //6. Enter correct email address and password
        automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys(ConfigReader.getProperty("toautoGecerliEmail"));
        automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys(ConfigReader.getProperty("toautoGecerliPass"));
        //extentTest.info("Gecerli Email ve Gecerli Pass girisi saglandi");
        //7. Click 'login' button

        automationExcercise.logintoyouraccountLoginButtonElementi.click();
        // extentTest.info("Login buttonuna user tatafindan basildi");
        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        //  extentTest.pass("User name gorunur oldugu test edildi");
        //9. Click 'Logout' button
        automationExcercise.logoutButtonElementi.click();
        // extentTest.pass("Logout buttonu'na  basildi");
        //10. Verify that user is navigated to login page
        String expectedUrl="https://automationexercise.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        // extentTest.pass("Login page basarili sekilde donus yapma testi");
        Driver.quitDriver();


    }
}
