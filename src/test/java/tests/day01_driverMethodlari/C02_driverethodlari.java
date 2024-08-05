package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverethodlari {
    public static void main(String[] args) throws InterruptedException {

// her acitigimiz class da ilk isimiz webdriver objesi olusturmak olucaktir

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle()); // bize title getirir// testotomasyonu

        System.out.println(driver.getCurrentUrl()); //TEst otmasyonu

        System.out.println(driver.getPageSource());// html sayfanin kaynak kodlarini getirir

        System.out.println(driver.getWindowHandle());
        //2BC0D8864096F1C2A651CD4F6506C782
        //Selenium Webdriver actii her browser icin benzersiz bir handle degeri uretir
        //Eger testimiz calsirken driver objesi ile birden fazla window acildi ise
        //bu windilar arasinda gecisi winwodHandle degerin ile yapabiliriz

        System.out.println(driver.getWindowHandles());
        //[BC51687AD6AADB0E7D9AE8D779AB48AE] eger driver birden fazala window
        //acilmis olsaydi birden fazla windowdegeri gorebilriz


        Thread.sleep(5000);

        driver.quit();
    }
}
