package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_LocatorveWebElementKullanimi {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Testotomasyonu anasayfa gidin
        driver.get("https://www.testotomasyonu.com/");
        //Aramakutusunu locate edin
        //id'si global-search olan webelment dedgimizde unique degere ulasiyoruz
        //locate olarak By.id() kullanabilirz

        //locate etme, belirlenen adresi ve locator'i kullanrak
        //istenen web elementi icinde bulundugmuz class;dan kullanirlar hale getirmektir

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        //Arama kutusuna "phone" yazdirin

        aramaKutusu.sendKeys("phone");

        //Enter Basark aramayi yaptirin
        aramaKutusu.submit();


        //sayfayi kapatin


        driver.quit();
    }
}
