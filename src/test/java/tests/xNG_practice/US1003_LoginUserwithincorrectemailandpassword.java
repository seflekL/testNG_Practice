package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;


public class US1003_LoginUserwithincorrectemailandpassword extends TestBaseCross {

    @Test
    public void TC03(){
       // extentTest=extentReports.createTest(" Correct Login TesT","US1003 Login User with incorrect email and password");
        AutomationExcercise automationExcercise=new AutomationExcercise();
        Faker faker=new Faker();
        //US1003 Login User with incorrect email and password

        //1. Launch browser
        // extentTest.info("Browser acildi");
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        // extentTest.info("Automationexercise.com sayfasinda gildildi");
       //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        // extentTest.pass("Automation excersise logosu gorun oldugu test edildi  ");
        //4. Click on 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        // extentTest.info("SignUP/SignIn butonuna basildi");
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationExcercise.logintoyouraccountLoginButtonElementi.isDisplayed());
        // extentTest.pass("Login to your account buttonu gorunurlugu test edildi");
        //6. Enter incorrect email address and password
        automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys(faker.internet().emailAddress());
        // extentTest.info("Yanlis email adresi girildi ");
        automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys(faker.internet().password());
        //extentTest.info("Yanlis Password girildi");
        //7. Click 'login' button
          automationExcercise.logintoyouraccountLoginButtonElementi.click();
        // extentTest.info("Login Button'a basildi");
        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(automationExcercise.loginincorrectemailPassTextElementi.isDisplayed());
        // extentTest.pass("Sisteme Login olunmadigi test edildi");

    }

}
