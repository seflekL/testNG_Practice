package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkotomosyon {

    public static void main(String[] args) throws InterruptedException {
        /*
        Kurulum dosyalarini proje altina kopyalamk  selenium ve chrome driver'i
        proje ekelmek icin tyeterli degildir.
        Selenium' kurmak icin jar dosylarini  olusturdugmuz her proje de bir kez
        proje tanitmaliyiz

        chromedriver exe.ise  her class da wevdriver objesi olusruurken kullanilir.
         */

        /*
        Selenium bizim istedigimiz otmosyanlari olusturacagimiz WebDriver objesi ile yapar

        Selenium ile bir otomosyon yapilcaksa once WebDriver objesi olusturmalidir.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

         //driver object calistiginda var olan  web broweserin bir kopyasini
        //olusturup bizi beklerler
        driver.get("https://testotomasyonu.com");
        /*
        Otomasyon ile bir url gitmek icin tum url yazmak gerekir
        urlde https:// kullanilmazsa selenium verilen url gitmez
        www kullanmak da olabilir
         */


        Thread.sleep(5000);


        driver.close();
        ///driver olusturuken acilan window;u kapatir
       // driver.quit();
        // driver calsitigi muddetce acilan tum windowlari kapatir
    }

}
