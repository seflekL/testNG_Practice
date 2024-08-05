package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DrivermanageWindowMethodlari {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // DRIVR OLUSTURU OLUSTURMAZ TAM SAYFA YAP
        // HER SFERDINDE DRIVER MANAGE WINDOW MAX KULLAN
        Thread.sleep(2000);


        driver.get("https://testotomasyonu.com");

        System.out.println("Maximize Size : " +driver.manage().window().getSize());
        System.out.println("Maximize Konum : " +driver.manage().window().getPosition());

        //Eger tum ekrani kaplamasini istersek fullscren kullaniriz

        driver.manage().window().fullscreen();
        System.out.println("Full Screen Size : " +driver.manage().window().getSize());
        System.out.println("Full Screen Konum : " +driver.manage().window().getPosition());
        Thread.sleep(2000);

        // konumu (200, 200 ) ve boyutu da ( 800,500) boyut ve konum ayarlamak icin

        driver.manage().window().setPosition(new Point(200,200));
        driver.manage().window().setSize(new Dimension(800,500));

        System.out.println("Ozel Screen Size : " +driver.manage().window().getSize());
        System.out.println("Ozel Screen Konum : " +driver.manage().window().getPosition());

        Thread.sleep(2000);

        driver.quit();


     }
}
