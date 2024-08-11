package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class US1010_VerifySubscriptionoInhomepage {
    //Features: user should be able to navigato Subscription's Homepage
    //Scenario : Test Case 1010 : Verify Subscription in home page
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void TC1010() {
        AutomationExcercise automationExcercise = new AutomationExcercise();
        Faker faker = new Faker();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Scroll down to footer
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.footersubscribeEmailBox);
        ReusableMethods.bekle(3);

        //5. Verify text 'SUBSCRIPTION'
        Assert.assertTrue(automationExcercise.footerSubscriptionTextElementi.isDisplayed());
        //6. Enter email address in input and click arrow button
        automationExcercise.footersubscribeEmailBox.sendKeys(faker.internet().emailAddress());
        automationExcercise.footersubscribeButton.click();

        //7. Verify success message 'You have been successfully subscribed!' is visible
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        WebElement visibileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='alert-success alert']")));
        System.out.println(visibileElement.getText());
        Assert.assertTrue(automationExcercise.footerSubscriptionTextElementi.isDisplayed());


    }
}
