package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1014_PlaceOrderRegisterwhileCheckout {

    //Feature: user should be able to verifyproduct quantity in Cart
    //Scenario : Test Case 1014 : Verify Product quantity in Cart
    @Test
    public void TC1014() {

        AutomationExcercise automationExcercise = new AutomationExcercise();
        Actions action = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Add products to cart
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(1);
        automationExcercise.categoryFirstProductLink.click();
        //5. Click 'Cart' button
        automationExcercise.addtocartButton.click();
        automationExcercise.viewcartButtonElementi.click();
        //6. Verify that cart page is displayed
        String expectedUrl = "https://automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        //7. Click Proceed To Checkout
        automationExcercise.proceedcheckoutButtonElementi.click();
        //8. Click 'Register / Login' button
        automationExcercise.registerLoginButtonElementi.click();
        //9. Fill all details in Signup and create account
        automationExcercise.signupNameBoxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.signupEmailboxElementi.sendKeys(faker.internet().emailAddress());
        automationExcercise.signupButtonElementi.click();
        automationExcercise.mrBoxbuttonElementi.click();
        automationExcercise.passwordBoxElementi.sendKeys("1234");
        Select selectDay = new Select(automationExcercise.dayDDMElementi);
        selectDay.selectByValue("1");
        Select selectMonth = new Select(automationExcercise.monthDDMElementi);
        selectMonth.selectByValue("8");
        Select selectYear = new Select(automationExcercise.yearsDDMElementi);
        selectYear.selectByValue("1900");
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.receiveSpecialButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.receiveSpecialButtonElementi.click();
        automationExcercise.adressfirstnameBoxinElementi.sendKeys(faker.funnyName().name());
        automationExcercise.adresslastnameBoxinElementi.sendKeys(faker.funnyName().name());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adresscompanyBoxinElementi);
        ReusableMethods.bekle(1);
        automationExcercise.adresscompanyBoxinElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.adressAdressElementi.sendKeys("hugogogo oleye oley");
        Select countryboxelementi = new Select(automationExcercise.adresscontryDDMElementi);
        countryboxelementi.selectByValue("Canada");
        automationExcercise.addresstateAdressBoxElementi.sendKeys("OT");
        automationExcercise.adresscityBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().quote());
        automationExcercise.addressZipboxElementi.sendKeys("1234");
        automationExcercise.adressMobileElementi2.sendKeys("1234567885");
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.createbuttonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.createbuttonElementi.click();

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        Assert.assertTrue(automationExcercise.accountCreatedTextWebElementi.isDisplayed());
        automationExcercise.accountcreatedContinueButtonElementi.click();
        ReusableMethods.bekle(5);
        //11. Verify ' Logged in as username' at top
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        //12.Click 'Cart' button
        automationExcercise.headerCartButtonElementi.click();
        //13. Click 'Proceed To Checkout' button
        automationExcercise.proceedcheckoutButtonElementi.click();
        //14. Verify Address Details and Review Your Order
        Assert.assertTrue(automationExcercise.yourdeliveryaddressTExtElementi.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutItemDescriptionBoxElementi);
        ReusableMethods.bekle(1);
        Assert.assertTrue(automationExcercise.checkoutItemDescriptionBoxElementi.isDisplayed());

        //15. Enter description in comment text area and click 'Place Order'
        automationExcercise.checkoutpageBodyBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().marvinQuote());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutPlaceOrderButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.checkoutPlaceOrderButtonElementi.click();
        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationExcercise.paymentnameOntheCardBox.sendKeys(faker.funnyName().name());
        automationExcercise.paymentCardNumberBoxElementi.sendKeys("1234578984564");
        automationExcercise.paymenCVCboxElementi.sendKeys("123");
        automationExcercise.paymentExpirationBoxElementi.sendKeys("03");
        automationExcercise.paymentYearCardBoxElementi.sendKeys("2090");

        //17. Click 'Pay and Confirm Order' button
        automationExcercise.paymentPayandConfirmButtonElementi.click();
        //18. Verify success message 'Your order has been placed successfully!'
        Assert.assertTrue(automationExcercise.paymentdonepageCongratulationsorderconfirmedTextButton.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();
        //19. Click 'Delete Account' button
        automationExcercise.deleteAccountElementi.click();
        //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();

        Driver.quitDriver();

    }
}
