package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;

public class US1012_AddProductsinCart {

    //Features: user should be able to add products in the cart
    //Scenario : Test Case 1012 : Add Products in Cart

@Test
    public void US1012(){
    AutomationExcercise automationExcercise=new AutomationExcercise();
    Faker faker= new Faker();

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    //3. Verify that home page is visible successfully
   Assert.assertTrue( automationExcercise.logoElementi.isDisplayed());
    //4. Click 'Products' button
    automationExcercise.productLinkElementi.click();
    //5. Hover over first product and click 'Add to cart'
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
    Driver.getDriver().findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]")).click();
    //6. Click 'Continue Shopping' button
    automationExcercise.categoryContinueShoppingButtonElementi.click();
    //7. Hover over second product and click 'Add to cart'
    jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categorySeccondProductLinkWebElementi);
    automationExcercise.categorySeccondProductAddCartButtonElementi.click();

    //8. Click 'View Cart' button
    automationExcercise.categorySeccondProductAddtoCartLink.click();
    //9. Verify both products are added to Cart

    System.out.println(automationExcercise.categoryproductListcartList.size());
    Assert.assertTrue(automationExcercise.categoryproductListcartList.size()==2);

    //10. Verify their prices, quantity and total price

    String  expectedfirstProductPrice="Rs. 500";
    String  expectedSeccondProductPrice="Rs. 400";
    String  expectedfirstProductQuantity="1";
    String  expectedSeccondProductQuantity="1";
    String  expectedfirstProductTotatlprice= "Rs. 500";
    String  expectedSeccondProductTotalPRice= "Rs. 400";

    Assert.assertEquals(expectedfirstProductPrice,automationExcercise.cartProduct1PriceElementi.getText());
    Assert.assertEquals(expectedSeccondProductPrice,automationExcercise.cartProduct2PriceElementi.getText());
    Assert.assertEquals(automationExcercise.cartProduct1QuantityElementi.getText(),expectedfirstProductQuantity);
    Assert.assertEquals(automationExcercise.cartProduct2QuantityElementi.getText(),expectedSeccondProductQuantity);
    Assert.assertEquals(automationExcercise.getCartProduct1TotalPriceElementi.getText(),expectedfirstProductTotatlprice);
    Assert.assertEquals(automationExcercise.getCartProduct2TotalPriceElementi.getText(),expectedSeccondProductTotalPRice);





    Driver.quitDriver();



}

    }





