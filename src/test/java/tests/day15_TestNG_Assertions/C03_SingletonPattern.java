package tests.day15_TestNG_Assertions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_SingletonPattern {

    @Test

    public void test01(){
        TestOtomasyonuPage testOtomasyonuPage= new TestOtomasyonuPage();
        // testotomasyonu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // aranacak kelime icin arama yapin

        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+ Keys.ENTER);



        // arama sonucunda urun bulunabildigini test edin
        Assert.assertTrue(testOtomasyonuPage.aramaSonucuElementi.isDisplayed());
        // sayfayi kapatin
        Driver.quitDriver();

    }
}
