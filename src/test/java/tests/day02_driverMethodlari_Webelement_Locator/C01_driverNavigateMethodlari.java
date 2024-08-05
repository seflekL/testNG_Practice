package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

         System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
/*
9 satirin gorevi bilgisayriimzda fiziki olarak kullandigimiz chrome versiyonuna uygun
selenium.dev sitesinden indirdigimiz ve kopya browser olustmamizi saglayan chromedriver.exe
dosyasini classimiza tanitmaktir

Selenium 4.0 versiyonu ile kutupahanelerine tum gnecl browserlara ait driverlari yukledi.
Boylece bir class olusturdugumuzda :

BIZ ISTERSEK KENDI DRIVER IMIZI 9 SATIRI KULLNARAK TANITA BILIR VEYA ISTERSEL DIREK 9.SATIRI ATLAYIP
SELENIIUM KENDI DRIVERLARINI KULLANABILIR
SIRKET KENDI DRIVERLARINI ISTERSE KULALNBILIR ILLA CHORME KULLAMMAYA BILIR
 */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        driver.navigate().to("https://wisequarter.com");

        //Navigate to  get  navivigate de aynidir

        //Navigate kullanildyisa back komutu ile bir onceki sayfaya donevilirsiniz

        driver.navigate().back();

        Thread.sleep(3000);
        // kapatigimiz safaya tekrar doner
        driver.navigate().forward();
        Thread.sleep(3000);
        //sayfayi  yenilemek icin
        driver.navigate().refresh();
        Thread.sleep(3000);


        driver.close();
    }
}
