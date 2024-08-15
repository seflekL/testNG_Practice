package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1015_PlaceOrderRegisterbeforeCheckout {


    //Feature: user should able to place a new order  before Checkout
    //Scenario: TC1015 Place Order: Register before Checkout
    @Test
    public void TC1015 () {
        AutomationExcercise automationExcercise=new AutomationExcercise();
        Faker faker=new Faker();
        Actions action = new Actions(Driver.getDriver());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        //5. Fill all details in Signup and create account
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

        //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        Assert.assertTrue(automationExcercise.accountCreatedTextWebElementi.isDisplayed());
        automationExcercise.accountcreatedContinueButtonElementi.click();
        ReusableMethods.bekle(1);
        //7. Verify ' Logged in as username' at top
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        //8. Add products to cart
        jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(1);
        automationExcercise.categoryFirstProductLink.click();
        //9. Click 'Cart' button
        automationExcercise.addtocartButton.click();
        automationExcercise.viewcartButtonElementi.click();
        //10. Verify that cart page is displayed
        String expectedUrl = "https://automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        //11. Click Proceed To Checkout
        automationExcercise.proceedcheckoutButtonElementi.click();

        //12. Verify Address Details and Review Your Order
        Assert.assertTrue(automationExcercise.yourdeliveryaddressTExtElementi.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutItemDescriptionBoxElementi);
        ReusableMethods.bekle(1);
        Assert.assertTrue(automationExcercise.checkoutItemDescriptionBoxElementi.isDisplayed());
        //13. Enter description in comment text area and click 'Place Order'
        automationExcercise.checkoutpageBodyBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().marvinQuote());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutPlaceOrderButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.checkoutPlaceOrderButtonElementi.click();
        //14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationExcercise.paymentnameOntheCardBox.sendKeys(faker.funnyName().name());
        automationExcercise.paymentCardNumberBoxElementi.sendKeys("1234578984564");
        automationExcercise.paymenCVCboxElementi.sendKeys("123");
        automationExcercise.paymentExpirationBoxElementi.sendKeys("03");
        automationExcercise.paymentYearCardBoxElementi.sendKeys("2090");
        //15. Click 'Pay and Confirm Order' button
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.paymentPayandConfirmButtonElementi);
        ReusableMethods.bekle(2);
        automationExcercise.paymentPayandConfirmButtonElementi.click();

        //16. Verify success message 'Your order has been placed successfully!'
        Assert.assertTrue(automationExcercise.paymentdonepageCongratulationsorderconfirmedTextButton.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();
        //17. Click 'Delete Account' button
        automationExcercise.deleteAccountElementi.click();

        //18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();

        Driver.quitDriver();

    }
}
