package tests.xNG_practice;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;

public class US1005_RegisterUserwithexistingemail extends TestBaseRapor {

    //Feature: Test Case 5: Register User with existing email
     @Test
     public void test01(){
           AutomationExcercise automationExcercise=new AutomationExcercise();

         //1. Launch browser

         //2. Navigate to url 'http://automationexercise.com'
         Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

         //3. Verify that home page is visible successfully
         Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());

         //4. Click on 'Signup / Login' button
         automationExcercise.signupLoginButtonElementi.click();

         //5. Verify 'New User Signup!' is visible

         Assert.assertTrue(automationExcercise.newUserSignupTextElementi.isDisplayed());


         //6. Enter name and already registered email address

         automationExcercise.signupNameBoxElementi.sendKeys("niko");
         automationExcercise.signupEmailboxElementi.sendKeys("niko@niko.com");

         //7. Click 'Signup' button
         automationExcercise.signupButtonElementi.click();

         //8. Verify error 'Email Address already exist!' is visible
         Assert.assertTrue(automationExcercise.emailAdressAlreadyExistElemneti.isDisplayed());
     }
}
