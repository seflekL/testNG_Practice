package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L06_freefall {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin

        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin

        WebElement otomasyonarama= driver.findElement(By.id("global-search"));

        otomasyonarama.sendKeys("phone");

        otomasyonarama.submit();

      //  arama sonucunda 3'den fazla urun bulunabildigini test edin

       WebElement sonucElement= driver.findElement(By.className("product-count-text"));

       String aranansayi=sonucElement.getText();
       aranansayi=aranansayi.replaceAll("\\D","");
       int aramasonucSayisi=Integer.parseInt(aranansayi);
        int expectedMinSonucSayisi= 3;

       if (aramasonucSayisi>expectedMinSonucSayisi) {
           System.out.println("Arama sonuc testi passed ");


       } else {
           System.out.println("Arama sonuc sayisi failed ");
       }







    }
}
