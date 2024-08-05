package tests.day02_driverMethodlari_Webelement_Locator;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L01_freefall {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://google.com");

        driver.navigate().to("http://youtube.com");


        driver.navigate().back();


        driver.navigate().refresh();


        driver.navigate().forward();

        driver.manage().window().setPosition(new Point(200,200));
        driver.manage().window().setPosition(new Point(40,200));

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.close();


    }
}
