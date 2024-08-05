package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L06_freefall03 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");
        WebElement aa=driver.findElement(By.id("global-search"));
        aa.sendKeys("Phone");
        aa.submit();
        WebElement sayiAA=driver.findElement(By.className("product-count-text"));
        //System.out.println(sayiAA.getText());
        String aramaSonucsayi=sayiAA.getText();
        aramaSonucsayi=aramaSonucsayi.replaceAll("\\D","");
      //  System.out.println(aramaSonucsayi);
        int sayiParse=Integer.parseInt(aramaSonucsayi);
        int sayiActual=3;

        if (sayiParse>sayiActual){
            System.out.println("Arama Sonuc Testi 3'den buyuktur TEST PASS");
        } else System.out.println("Arama Sonuc Testi Failed");
    }
}
