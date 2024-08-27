package tests.xNG_practice;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US1020_TestCase20SearchProductsandVerifyCartAfterLogin {

    @Test
    public void TC1020() {
        AutomationExcercise automationExcercise = new AutomationExcercise();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Click on 'Products' button
        automationExcercise.productLinkElementi.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl = "https://www.automationexercise.com/products";
        String acutalUrl = "https://www.automationexercise.com/products";
        Assert.assertEquals(acutalUrl, expectedUrl);
        //5. Enter product name in search input and click search button

        automationExcercise.productSearchBoxelementi.sendKeys("Jeans");
        automationExcercise.productSearchBoxButtonElementi.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.leftsidebarCategoriesTextElementi);
        Assert.assertTrue(automationExcercise.leftsidebarCategoriesTextElementi.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(automationExcercise.leftsidebarCategoriesTextElementi.isDisplayed());

        //6. Verify 'SEARCHED PRODUCTS' is visible
        List<WebElement> productElementlist = automationExcercise.searchResultJeanList;
        List<String> productstr = ReusableMethods.getStringList(productElementlist);
        for (String eachElement : productstr) {

            if (eachElement.contains("Soft Stretch Jeans")) {
                System.out.println("Listede olan ilk urun vardir");
            }

        }
        //7. Verify all the products related to search are visible
         List<String> expecetedItems = Arrays.asList("Soft Stretch Jeans", "Regular Fit Straight Jeans", "Grunt Blue Slim Fit Jeans");

        Assert.assertTrue(productstr.get(0).contains(expecetedItems.get(0)));
        Assert.assertTrue(productstr.get(1).contains(expecetedItems.get(1)));
        Assert.assertTrue(productstr.get(2).contains(expecetedItems.get(2)));

        //8. Add those products to cart
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.addtocart1Elementi);
        ReusableMethods.bekle(2);

        automationExcercise.addtocart1Elementi.click();
        automationExcercise.continueShoppingButtonElmenti.click();
        automationExcercise.addtocart2Elementi.click();
        automationExcercise.continueShoppingButtonElmenti.click();
        automationExcercise.addtocart3Elementi.click();

        //9. Click 'Cart' button and verify that products are visible in cart
        automationExcercise.viewcartButtonElementi.click();
        Assert.assertTrue(automationExcercise.cartList.get(0).isDisplayed());
        //10. Click 'Signup / Login' button and submit login details

        automationExcercise.signupLoginButtonElementi.click();
       automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys("niko@niko.com");
       automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys("1234");
        automationExcercise.logintoyouraccountLoginButtonElementi.click();
        //11. Again, go to Cart page
       automationExcercise.headerCartButtonElementi.click();
        //12. Verify that those products are visible in cart after login as well
        Assert.assertTrue(automationExcercise.cartList.get(0).isDisplayed());

        //13. Close teh driver
        Driver.quitDriver();
    }
}



