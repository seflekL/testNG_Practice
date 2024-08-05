package tests.xNG_practice;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class FreeFall01 extends TestBaseRapor {

    @DataProvider
    public static Object [][] kelimeleriGonderenDataProvider(){

        String[][]aranacakKelimelerArrayi= {{"java"},{"phone"},{"apple"},{"samsung"},{"nutella"},{"cokoprens"},{"dress"}};
    return aranacakKelimelerArrayi;

    }
    @Test(dataProvider = "kelimeleriGonderenDataProvider")

    public void dataProviderIleCokluAramaTesti (String aranacakKelime){
        extentTest=extentReports.createTest("Coklu Arama Testi","Birden fazla kelimeyi ayni aratmak icin olusturulmustur.");
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("User hedef sayfa gider");

        testOtomasyonuPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
        extentTest.info("User aramaKutusu aranacak kelime yazildi");
        String unexpectedSonucYazisi="0 Products Found";
        String actualSonucyazisi=testOtomasyonuPage.aramaSonucuElementi.getText();

        Assert.assertNotEquals(actualSonucyazisi,unexpectedSonucYazisi);
        extentTest.pass("Sonuc testi");

    }

}
