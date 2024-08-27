package tests.xNG_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

@Test
public class US1018_ViewCategoryProducts {

    public void testcase1018(){
        AutomationExcercise automationExcercise=new AutomationExcercise();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that categories are visible on left side bar
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",automationExcercise.leftsidebarCategoriesTextElementi);
        Assert.assertTrue(automationExcercise.leftsidebarCategoriesTextElementi.isDisplayed());
        ReusableMethods.bekle(1);
        //4. Click on 'Women' category
        automationExcercise.leftsidebarWomenButonElementi.click();
        //5. Click on any category link under 'Women' category, for example: Dress
        ReusableMethods.bekle(1);

        automationExcercise.leftsidebarWomenTopProductsButtonu.click();

        //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        Assert.assertTrue(automationExcercise.womenTopProductsTextElementi.isDisplayed());
        //7. On left side bar, click on any sub-category link of 'Men' category
        automationExcercise.leftsidebarsidebarMenButtonElementi.click();
        ReusableMethods.bekle(2);
       automationExcercise.leftsidebarmenJeanButtonelementi.click();
        //8. Verify that user is navigated to that category page
        Assert.assertTrue(automationExcercise.menJeansProductstTitleElementi.isDisplayed());
         //9. Close the Driver
        Driver.quitDriver();


    }
}
