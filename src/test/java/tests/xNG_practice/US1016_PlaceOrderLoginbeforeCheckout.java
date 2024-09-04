package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1016_PlaceOrderLoginbeforeCheckout {

    @Test
    public void TC1016() {
        AutomationExcercise automationExcercise = new AutomationExcercise();
        Faker faker = new Faker();
        Actions action = new Actions(Driver.getDriver());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        //Feature: user should be able to place a new order  before Checkout
        //Scenario: TC1016 Place Order: Register before Checkout

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        //5. Fill email, password and click 'Login' button
        automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys("niko@niko.com");
        automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys("1234");
        automationExcercise.logintoyouraccountLoginButtonElementi.click();
        //6. Verify 'Logged in as username' at top
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        //7. Add products to cart
        jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(1);
        automationExcercise.categoryFirstProductLink.click();
        automationExcercise.addtocartButton.click();
        //8. Click 'Cart' button
        automationExcercise.viewcartButtonElementi.click();
        //9. Verify that cart page is displayed
        String expectedUrl = "https://automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        //10. Click Proceed To Checkout
        automationExcercise.proceedcheckoutButtonElementi.click();
        //11. Verify Address Details and Review Your Order
        Assert.assertTrue(automationExcercise.yourdeliveryaddressTExtElementi.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutItemDescriptionBoxElementi);
        ReusableMethods.bekle(1);
        Assert.assertTrue(automationExcercise.checkoutItemDescriptionBoxElementi.isDisplayed());
        //12. Enter description in comment text area and click 'Place Order'
        automationExcercise.checkoutpageBodyBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().marvinQuote());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutPlaceOrderButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.checkoutPlaceOrderButtonElementi.click();
        //13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationExcercise.paymentnameOntheCardBox.sendKeys(faker.funnyName().name());
        automationExcercise.paymentCardNumberBoxElementi.sendKeys("1234578984564");
        automationExcercise.paymenCVCboxElementi.sendKeys("123");
        automationExcercise.paymentExpirationBoxElementi.sendKeys("03");
        automationExcercise.paymentYearCardBoxElementi.sendKeys("2090");
        //14. Click 'Pay and Confirm Order' button
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.paymentPayandConfirmButtonElementi);
        ReusableMethods.bekle(2);
        automationExcercise.paymentPayandConfirmButtonElementi.click();

        //15. Verify success message 'Your order has been placed successfully!'
        Assert.assertTrue(automationExcercise.paymentdonepageCongratulationsorderconfirmedTextButton.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();
        //16. Click 'Delete Account' button
        automationExcercise.deleteAccountElementi.click();

        //17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();

        Driver.quitDriver();


    }
}
