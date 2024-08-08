package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class TC6_ContactUsForm {
  //https://youtube.com/watch?v=Uraakjx1TYM
    @Test
    //Features: US1006 Users can easily send message through contact form.
    //  Scenario: TC1006  Contact Us Form
    public void tc1006(){
        AutomationExcercise automationExcercise=new AutomationExcercise();
        Faker faker=new Faker();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click on 'Contact Us' button
        automationExcercise.contactUsElementi.click();
        //5. Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(automationExcercise.contactUSgetintouchTextElmenti.isDisplayed());
        //6. Enter name, email, subject and message
        automationExcercise.contactUsNameboxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.contactUsEmailBoxElementi.sendKeys(faker.internet().emailAddress());
        automationExcercise.contactUSsubjectBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().character());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",automationExcercise.contactUsBodyBoxElementi);
        ReusableMethods.bekle(1);
        automationExcercise.contactUsBodyBoxElementi.sendKeys(faker.backToTheFuture().quote());
        //7. Upload file
        Driver.getDriver().findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("C:\\Users\\levoo\\Desktop\\WiseQuarter\\1699.png");
        //8. Click 'Submit' button
        ReusableMethods.bekle(5);
        //9. Click OK button
         automationExcercise.contactUsSubmitButtonElementi.click();
         Driver.getDriver().switchTo().alert().accept();
         ReusableMethods.bekle(2);
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        Assert.assertTrue(automationExcercise.contactUsSuccesTextElementi.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        automationExcercise.contactUSHomeButton.click();
        ReusableMethods.bekle(2);
        Driver.quitDriver();

    }
}
