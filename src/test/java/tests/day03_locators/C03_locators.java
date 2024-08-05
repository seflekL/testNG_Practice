package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_locators {

    public static void main(String[] args) {

      // 1- Bir test class’i olusturun ilgili ayarlari yapin


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      // 2- https://www.automationexercise.com/ adresine gidin


        driver.get("https://www.automationexercise.com/");

      // 3- Sayfada 147 adet link bulundugunu test edin.


        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        if (linkElementleriList.size()==expectedLinkSayisi){
            System.out.println("Link Sayisi Testi Passed!");

        }else System.out.println("Link Sayisi Testi Failed!");
//cookies'i kabul edin

      // 4- Products linkine tiklayin


driver.findElement(By.xpath("//*[@href='/products']")).click();

      // 5- special offer yazisinin gorundugunu test edin


        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer Testi Passed!");
        }else System.out.println("Special offer Testi Failied");

      // 6- Sayfayi kapatin


      // automationexercise.com
      // Automation Exercise
      // This is for automation practice
    }
}
