package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageTimeouts {
    public static void main(String[] args) {



        //ImpicilityWait afarkli oalrak gorece dayali bekemeyi yapar.
        //Biz 10 saniye tanimladigimizd  10 sniye bekler
        //daha erken biterse yoluna devam eder 10 saniyenin dolmasini beklmez
        //Ancak 10 saniye dolmasina ragmen gorev bitmedi ise expection verir calisma yi durduru
        // ImplicityWait iki temel gorev icin bekleme yapar
        //1-Sayfanin acilip egelerin ogelerin yuklenmesini bekler
        //2-herhangi bir 0ogeyi kullanmaz grektingde o ogeyi bulmak
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testotomasyonu.com");

        driver.quit();
        /*
        Thread sleep Javadan gelir ve kodlari valsimasini bizim belirdegimiz surece durdurur

        Testi ilk defa yazarken test adimlarini gormemiz veya sunum yaptigimizda sunum kisileri adimlari
        gostermmiz acisindan uydundur.

        Bazen de bilgisyariminz veya internettin hizindan dolayi kodlari ilerdegine istedigimiz adimlari
        gerceklestirmeyiblir internet yavas mecburkalirsak Thread.sleep(); kullanabilir

        Eger testi hazirlmayi bitirdik e hiz acisindan da beklemeyi mecbur kilan bir durum yoksa
        Thread.sleepleri silmek de fayda vardir.
         */

    }
}
