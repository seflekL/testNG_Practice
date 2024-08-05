package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        /*
 1. testotomasyonu sayfasina gidelim. https://www..../
2. Sayfa basligini(title) yazdirin
3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
4. Sayfa adresini(url) yazdirin
5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
6. Sayfa handle degerini yazdirin
7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
8. Sayfayi kapatin.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://testotomasyonu.com/");
      // 2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
      // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String expectedTitleIcerik= "Test Otomasyonu";
        //actual tittle herzman driverdan alinir
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title Testi pass");
        }else System.out.println("Test Failed");

      // 4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

      // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedURL="https://www.testotomasyonu.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedURL.equals(actualUrl)) {
            System.out.println("Url Testi Passed");

        }else System.out.println("Url Testi Failed");

      // 6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle()); //ACB068844DF499F9E7C59E46D175B226

        // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String expectedHtmlIcerik= "otomasyon";
        String actualSayfaKayangi= driver.getPageSource();
        if (actualSayfaKayangi.contains(expectedHtmlIcerik)){
            System.out.println("Sayfa kayanagi testi PASSED");
        } else System.out.println("Sayfa Kaynagi testi FAILED");


      // 8. Sayfayi kapatin.

        Thread.sleep(5000);
        driver.quit();
    }
}
