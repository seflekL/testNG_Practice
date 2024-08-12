package tests.xNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1013_VerifyProductquantityinCart {

    @Test

    //Features: user should be able to verifyproduct quantity in Cart
    //Scenario : Test Case 1013 : Verify Product quantity in Cart

    public void TC1013(){
        AutomationExcercise automationExcercise=new AutomationExcercise();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Click 'View Product' for any product on home page
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        Driver.getDriver().findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]"));
        automationExcercise.categoryFirstProductLink.click();
        //5. Verify product detail is opened
        Assert.assertTrue(automationExcercise.categoryFirstProductBrandElementi.isDisplayed());
        Assert.assertTrue(automationExcercise.categoryFirstProductPriceElementi.isDisplayed());
        Assert.assertTrue(automationExcercise.categoryFirstProductavaibilityStock.isDisplayed());

        //6. Increase quantity to 4

      automationExcercise.cartProductQuatityBoxElementi.sendKeys(Keys.DELETE);
        ReusableMethods.bekle(5);
      automationExcercise.cartProductQuatityBoxElementi.sendKeys("4");

       //7. Click 'Add to cart' button
        automationExcercise.addtocartButton.click();
        //8. Click 'View Cart' button
        automationExcercise.viewcartButtonElementi.click();
        //9. Verify that product is displayed in cart page with exact quantity
        Assert.assertEquals(automationExcercise.cartQuantityBoxElementi.getText(),"4");


    }
}
