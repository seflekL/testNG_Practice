package tests.xNG_practice;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1019_TestCaseViewCartBrandProducts {
    @Test
    public void TC1019() {
        AutomationExcercise automationExcercise = new AutomationExcercise();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Click on 'Products' button
        automationExcercise.productLinkElementi.click();
        //4. Verify that Brands are visible on left side bar
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.leftsidebarCategoriesTextElementi);
        Assert.assertTrue(automationExcercise.leftsidebarCategoriesTextElementi.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(automationExcercise.leftsidebarCategoriesTextElementi.isDisplayed());

        //5. Click on any brand name
        automationExcercise.leftsidebarWomenButonElementi.click();
        ReusableMethods.bekle(1);
        automationExcercise.leftsidebarWomenTopProductsButtonu.click();
        //6. Verify that user is navigated to brand page and brand products are displayed
        automationExcercise.womenTopProductsTextElementi.isDisplayed();
        //7. On left side bar, click on any other brand link
        automationExcercise.leftsidebarsidebarMenButtonElementi.click();
        automationExcercise.leftsidebarmenJeanButtonelementi.click();
        //8. Verify that user is navigated to that brand page and can see products
        Assert.assertTrue(automationExcercise.menJeansProductstTitleElementi.isDisplayed());
        //9.Close the Driver
        Driver.quitDriver();

    }
}
