package tests.day15_TestNG_Assertions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_MultipleAssertion {

    @Test

    public void test01(){

        TestOtomasyonuPage testOtomasyonuPage= new TestOtomasyonuPage();
        // Testotomasyonu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // url'in "testotomasyonu" icerdigini test edin
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // belirlenmis arama kelimesi icin arama yapin

        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+
                Keys.ENTER);
        // bulunan urun sayisinin 3'den fazla oldugunu test edin

        int urunListeSayi=3;
        int actualUrunList=testOtomasyonuPage.bulunanUrunElementleriList.size();

        Assert.assertTrue(actualUrunList>urunListeSayi);

        //ilk urunu tiklayin
        testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();

        // acilan sayfada urun isminde case sensitive olmadan
        // aranacak kelimenin bulundugunu test edin


    String actualurunIsim=testOtomasyonuPage.ilkUrunSayfasiIsimElementi.getText().toLowerCase();
    String expectedurunIsim=ConfigReader.getProperty("toAranacakKelime");

    Assert.assertTrue(actualurunIsim.contains(expectedurunIsim));


    }
}
