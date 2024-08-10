package tests.xNG_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

@Test
public class US1008_VerifyAllProductsandproductdetailpage {

    //Feature:  Verify All Products and product detail page
    //Scenario : Verify All Products and product detail page

    public void TC08() {
        AutomationExcercise automationExcercise = new AutomationExcercise();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click on 'Products' button
        automationExcercise.productLinkElementi.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationExcercise.categoryMainLogo.isDisplayed());
        //6. The products list is visible
        Assert.assertTrue(automationExcercise.categoryproductList.size() > 0);
        //7. Click on 'View Product' of first product
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(3);
        automationExcercise.categoryFirstProductLink.click();
        //8. User is landed to product detail page
        String expectedUrl = "https://automationexercise.com/product_details/1";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl);

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

        String expectedBrandWord = "Brand: Polo";
        String actualBrandWord=automationExcercise.categoryFirstProductBrandElementi.getText();
        Assert.assertTrue(actualBrandWord.contains(expectedBrandWord));
         System.out.println(actualBrandWord);
        String expectedCondtion = "Condition: New";
        String actualProductConditionElementi=automationExcercise.categoryFristProductCondtionElementi.getText();
        System.out.println(actualProductConditionElementi);
        Assert.assertTrue(actualProductConditionElementi.contains(expectedCondtion));
        String expectedproductAvialiability = "Availability: In Stock";
        String actualProductvialiability=automationExcercise.categoryFirstProductavaibilityStock.getText();
        System.out.println(actualProductvialiability);
        Assert.assertTrue(actualProductvialiability.contains(expectedproductAvialiability));
        String expectedPrice="Rs. 500";
        String actualProductPriceElementi=automationExcercise.categoryFirstProductPriceElementi.getText();
        System.out.println(actualProductPriceElementi);
        Assert.assertTrue(actualProductPriceElementi.contains(expectedPrice));
        Driver.getDriver().close();
    }


}
