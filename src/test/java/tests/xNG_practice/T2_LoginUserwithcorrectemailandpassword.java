package tests.xNG_practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T2_LoginUserwithcorrectemailandpassword extends TestBaseRapor {

    @Test
    public void testLogin() {
        extentTest = extentReports.createTest("Login Olma Testi", "Dogru User name ile Login olma testi");
        AutomationExcercise automationExcercise = new AutomationExcercise();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        extentTest.pass("User sayfa gider");
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        extentTest.pass("Anasayfada logo gorunumu test edilir");
        //4. Click on 'Signup / Login' button
        automationExcercise.signupLoginButtonElementi.click();
        extentTest.info("Sayfa gorunur olan SignUp button'a basilir");
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationExcercise.logintoyouraccountLoginButtonElementi.isDisplayed());
        extentTest.pass("Login button'u test edilir");
        //6. Enter correct email address and password
        automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys(ConfigReader.getProperty("toautoGecerliEmail"));
        extentTest.info("User gecerli email adresi giris sagladi");
        automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys(ConfigReader.getProperty("toautoGecerliPass"));
        extentTest.info("User gecerli password girisi saglar");
        //7. Click 'login' button
        automationExcercise.logintoyouraccountLoginButtonElementi.click();
        extentTest.pass("User Login buton'una tiklayarak giris yapar");
        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());
        extentTest.pass("User username'in gorun oldugu testi");
        //9. Click 'Delete Account' button
        automationExcercise.deleteAccountElementi.click();
        extentTest.info("User testin silinmesi icin Delete Button basar");
        //10. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();
        extentTest.pass("User account'un silindigini onaylar");

    }
}
