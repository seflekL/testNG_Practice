package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1001_testCase_1RegisterUser {


    @Test
    public void test01() {
        AutomationExcercise automationExcercise = new AutomationExcercise();
        Faker faker = new Faker();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click on 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationExcercise.newUserSignupTextElementi.isDisplayed());
        //6. Enter name and email address
        automationExcercise.signupNameBoxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.signupEmailboxElementi.sendKeys(faker.internet().emailAddress());
        //7. Click 'Signup' button
        automationExcercise.signupButtonElementi.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        Assert.assertTrue(automationExcercise.EnterAccountInfoElementi.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationExcercise.mrBoxbuttonElementi.click();
        automationExcercise.nameBoxWebelementi.sendKeys(faker.funnyName().name());
        automationExcercise.passwordBoxElementi.sendKeys(faker.internet().password());
        Select selectday = new Select(automationExcercise.dayDDMElementi);
        selectday.selectByValue("20");
        Select selectay = new Select(automationExcercise.monthDDMElementi);
        selectay.selectByValue("8");
        Select selectYil = new Select(automationExcercise.yearsDDMElementi);
        selectYil.selectByValue("1985");
        ReusableMethods.bekle(2);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adressfirstnameBoxinElementi);
        ReusableMethods.bekle(1);

        //10. Select checkbox 'Sign up for our newsletter!'
        ReusableMethods.bekle(2);
        automationExcercise.signupCheckBoxElementi.click();
        //11. Select checkbox 'Receive special offers from our partners!'
        automationExcercise.receiveSpecialButtonElementi.click();
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        automationExcercise.adressfirstnameBoxinElementi.sendKeys(faker.backToTheFuture().character());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adresslastnameBoxinElementi);
        ReusableMethods.bekle(4);
        automationExcercise.adresslastnameBoxinElementi.sendKeys(faker.funnyName().name());
        automationExcercise.adresscompanyBoxinElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().character());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adressAdressElementi);
        ReusableMethods.bekle(2);
        automationExcercise.adressAdressElementi.sendKeys("112 Marsica Ln");
        automationExcercise.addresstateAdressBoxElementi.sendKeys(faker.address().state());
        Select countryDDM = new Select(automationExcercise.adresscontryDDMElementi);
        countryDDM.selectByValue("Canada");
        automationExcercise.adresscityBoxElementi.sendKeys(faker.address().cityName());
        automationExcercise.addressZipboxElementi.sendKeys(faker.address().zipCode());
        automationExcercise.adressMobileElementi2.sendKeys(faker.phoneNumber().phoneNumber());

        //13. Click 'Create Account button'
        automationExcercise.createbuttonElementi.click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(automationExcercise.accountCreatedTextWebElementi.isDisplayed());


        //15. Click 'Continue' button

        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();

        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        //17. Click 'Delete Account' button
        automationExcercise.deleteAccountElementi.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();
    }

}