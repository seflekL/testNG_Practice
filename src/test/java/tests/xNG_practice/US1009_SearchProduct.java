package tests.xNG_practice;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US1009_SearchProduct {

    //Features: user should be able to search for products on the page

    //Scenario :  Search Product
    @Test
    public void TC01(){
        AutomationExcercise automationExcercise=new AutomationExcercise();

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click on 'Products' button
        automationExcercise.productLinkElementi.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl="https://automationexercise.com/products";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        //6. Enter product name in search input and click search button
        automationExcercise.categorysearchProductBoxElementi.sendKeys("blue top");
        automationExcercise.getCategorysearchProductBoxButtonElementi.click();
        //7. Verify 'SEARCHED PRODUCTS' is visible

        List<WebElement> productElementlist = automationExcercise.categoryproductList;
        for (WebElement prudoctElmenteach : productElementlist) {
            System.out.println(prudoctElmenteach.getText());
            Assert.assertTrue(prudoctElmenteach.isDisplayed());
        //8. Verify all the products related to search are visible
            Assert.assertTrue(automationExcercise.categoryproductList.size()>=1);
            System.out.println(automationExcercise.categoryproductList.size());

        }
        Driver.quitDriver();
     }

}
