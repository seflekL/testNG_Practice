package tests.day04_xpath_CssSelector_relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class L02_freeFallDeneme02 {

    public static void main(String[] args) throws InterruptedException {


        //1-  bir class olusturun

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2-  https://www.testotomasyonu.com/ adresine gidin

        driver.get("https://www.testotomasyonu.com/");

        //3-  Browseri tam sayfa yapin

        driver.manage().window().maximize();

        //4-  Sayfayi “refresh” yapin

        driver.navigate().refresh();

        //5-  Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin

        String actualTitle=driver.getTitle();
        String expectedTitle="Test Otomasyonu";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title check testi Passed!");
        }   else System.out.println("Title check testi Failed");


       //6-  Furniture linkine tiklayin

        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]")).click();

        //7-  price range filtresinde min degere 40, max degere 200 yazip filtreleyi

        WebElement minDeger=driver.findElement(By.xpath("//input[@class='form-control minPrice']"));
        WebElement maxDeger=driver.findElement(By.xpath("//input[@class='form-control maxPrice']"));
        WebElement fButton= driver.findElement(By.xpath("//*[@class='price-range-button']"));

        minDeger.clear();
        minDeger.sendKeys("40");
        maxDeger.clear();
        maxDeger.sendKeys("200");

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);

        fButton.click();

        //8-  filtreleme sonucunda urun bulunabildigini test edin

        List <WebElement> sonucList=driver.findElements(By.xpath("//div[@class='product-box mb-2 pb-1']"));

        if (sonucList.size()>0){
            System.out.println("Urun bulma testi Passed!");
        }else System.out.println("Urun bulma tessti Failed");

        //10-Ilk urunu tiklayin

        sonucList.get(0).click();

        //11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin.

        WebElement urunFiyat= driver.findElement(By.id("priceproduct"));

        String fiyatstr=urunFiyat.getText();
        fiyatstr=fiyatstr.replaceAll("\\D","");
        Double fiyatDouble=Double.parseDouble(fiyatstr);
        fiyatDouble/=100;
        System.out.println(fiyatDouble);

        if (fiyatDouble>=40 && fiyatDouble<=200){

            System.out.println("Fiyat Testi 40/200 Passed!");
        }else System.out.println("Fiyat Testi40/200 Passed!");

        //12-Sayfayi kapatin

        Thread.sleep(200);
        driver.quit();
    }
}
