package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L06_freefall02 {

    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com/");

        WebElement aramaBox= driver.findElement(By.id("global-search"));
        aramaBox.sendKeys("Phone");
        aramaBox.submit();

        WebElement birdenfazlaEleman=driver.findElement(By.className("product-count-text"));

        String birdenfazlaelemanaramaSonuc=birdenfazlaEleman.getText();
        birdenfazlaelemanaramaSonuc=birdenfazlaelemanaramaSonuc.replaceAll("\\D","");
        System.out.println(birdenfazlaelemanaramaSonuc);
        int aramasonucSayisi=Integer.parseInt(birdenfazlaelemanaramaSonuc);
        int expectedSayi=3;


    }
}
