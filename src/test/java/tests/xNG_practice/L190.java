package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class L190 {
@Test
    public void testnNuti(){

        //1- testotomasyonu anasayfaya gidin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        Driver.driver.get(ConfigReader.getProperty("toUrl"));
        //2- Nutella icin arama yapin
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakkelimeNut")+ Keys.ENTER);

        //3- Arama sonucunda urun bulunamadigini test edin
        Assert.assertTrue(testOtomasyonuPage.resultZeroProductTextElementi.isDisplayed());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    WebElement sayfadown=Driver.getDriver().findElement(By.className("price-range-button"));
    jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",sayfadown);
    ReusableMethods.bekle(4);


    //4- Arama sonuc sayfasinin fotografini cekip, jpeg olarak kaydedin
        ReusableMethods.getWebelementScreenshot(testOtomasyonuPage.resultZeroProductTextElementi);

    Driver.quitDriver();
    }

}
