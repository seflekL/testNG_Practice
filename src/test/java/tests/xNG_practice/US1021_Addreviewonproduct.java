package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ResourceBundle;

public class US1021_Addreviewonproduct {
    @Test
    public  void TC1020 (){
        AutomationExcercise automationExcercise=new AutomationExcercise();
        Faker faker=new Faker();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Click on 'Products' button
        automationExcercise.productLinkElementi.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationExcercise.allproductTextElementi.isDisplayed());
        //5. Click on 'View Product' button
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.viewcartButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.viewcartButtonElementi.click();
        //6. Verify 'Write Your Review' is visible
        Assert.assertTrue(automationExcercise.productWriteyourViewTextElementi.isDisplayed());
        //7. Enter name, email and review
        automationExcercise.prodcutReviewYourNameBoxelemeti.sendKeys(faker.funnyName().name());
        automationExcercise.prodcutReviewEmailBoxelemeti.sendKeys(faker.internet().emailAddress());
        automationExcercise.prodcutReviewrBodyBoxelemeti.sendKeys(faker.backToTheFuture().quote());
        //8. Click 'Submit' button
        ReusableMethods.bekle(5);
        automationExcercise.prodcutReviewrButtonelemeti.click();
        //9. Verify success message 'Thank you for your review.'
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Thank you for your review.']")));
        Assert.assertTrue(automationExcercise.prodcutReviewBoxThankyouforyourReviewElementi.isDisplayed());
        //10 Close the browser
        Driver.quitDriver();
    }
}
