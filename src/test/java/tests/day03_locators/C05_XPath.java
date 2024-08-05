package tests.day03_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_XPath {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        //2- Add Element butonuna basin
        //3- Remove butonu’nun gorunur oldugunu test edin
        //4- Remove tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    }
}
