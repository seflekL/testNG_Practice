package tests.day16_HTMLReports_DataProvider;

import org.junit.jupiter.api.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluNegatifLoginTesti extends TestBaseRapor {

    @Test
    public void gecersizPasswordTesti(){

        extentTest=extentReports.createTest("Gecersiz Password Testi",
                "Gecersiz credentials girildiginde sisteme giris yapilmamasi testi");

        // 1- https://www.testotomasyonu.com/ anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("https://www.testotomasyonu.com/ sayfasina gidilir");

    }

}
