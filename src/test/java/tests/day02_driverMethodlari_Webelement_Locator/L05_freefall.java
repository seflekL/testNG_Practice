package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L05_freefall {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //facebook.com' gidin

        driver.navigate().to("https://www.google.com/");

        //arama kutusunu locate edin
        WebElement element=driver.findElement(By.className("gLFyf"));

        element.sendKeys("phone");

        element.submit();


        Thread.sleep(2000);

        driver.navigate().to("https://yandex.com.tr/");

        WebElement elemanAra=driver.findElement(By.id("text"));

        elemanAra.sendKeys("phone");

        elemanAra.submit();

        Thread.sleep(2000);

        driver.navigate().to("https://www.yahoo.com/");

        WebElement arananYahoo=driver.findElement(By.id("ybar-sbq"));

        arananYahoo.sendKeys("phone");

        arananYahoo.submit();

        driver.navigate().to("https://www.bing.com/");

        WebElement arananBing=driver.findElement(By.id("sb_form_q"));

        arananBing.sendKeys("NYC");

        arananBing.submit();

     }
}
