package tests.xNG_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1017_RemoveProductsFromCart {

    @Test

    public void removeProduct(){

        AutomationExcercise automationExcercise=new AutomationExcercise();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationExcercise.logoElementi.isDisplayed());
        //4. Add products to cart
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",automationExcercise.categoryFirstProductLink);
        automationExcercise.categoryFirstProductLink.click();
        ReusableMethods.bekle(1);
        automationExcercise.addtocartButton.click();


        //5. Click 'Cart' button
        automationExcercise.viewcartButtonElementi.click();
        //6. Verify that cart page is displayed
        System.out.println(Driver.getDriver().getCurrentUrl());
        String expectedUrl="https://automationexercise.com/view_cartt";
        String actualUrl="https://automationexercise.com/view_cart";
        //7. Click 'X' button corresponding to particular product
        automationExcercise.cartScreenRemoveButonElmenti.click();
        ReusableMethods.bekle(2);
        //8. Verify that product is removed from the cart
        Assert.assertTrue(automationExcercise.cartScreenEmpyCartScreenText.isDisplayed());
        //9.Close the driver
        Driver.getDriver().quit();


    }
}
