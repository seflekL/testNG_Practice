package tests.day04_xpath_CssSelector_relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class L02_freeFallDeneme01 {

    public static void main(String[] args) throws InterruptedException {

        //1-  bir class olusturun

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2-  https://www.testotomasyonu.com/ adresine gidin


        driver.get("https://www.testotomasyonu.com/");

        //3-  Browseri tam sayfa yapin


        driver.manage().window().maximize();

        //4-  Sayfayi “refresh” yapin

        driver.navigate().refresh();

        //5-  Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        System.out.println(driver.getTitle());

        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi Passed!");
        }else System.out.println("Title testi Failed!");

        //6-  Furniture linkine tiklayin

        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]")).click();

        //7-  price range filtresinde min degere 40, max degere 200 yazip filtreleyin

        WebElement minDeger=driver.findElement(By.xpath("//*[@class='form-control minPrice']"));
        WebElement maxDeger=driver.findElement(By.xpath("//*[@class='form-control maxPrice']"));
        WebElement fbutton=driver.findElement(By.xpath("//*[@class='mx-3 my-2']"));

        minDeger.clear();
        minDeger.sendKeys("40");
        maxDeger.clear();
        maxDeger.sendKeys("200");
        Thread.sleep(2000);

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

       fbutton.click();


        //8-  filtreleme sonucunda urun bulunabildigini test edin

        List <WebElement> filterResult= driver.findElements(By.xpath("//*[@class='product-box mb-2 pb-1']"));

        if (filterResult.size()>0){
              System.out.println("Arama testi Passed!");
        }else System.out.println("Arama testi Failed!");


        //10-Ilk urunu tiklayin

        filterResult.get(0).click();

        //11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin.



        WebElement fiyatTest= driver.findElement(By.xpath("//*[@id='priceproduct']"));
        String fiyatstr=fiyatTest.getText();
        fiyatstr=fiyatstr.replaceAll("\\D","");
        System.out.println(fiyatstr);
        Double fiyatDouble=Double.parseDouble(fiyatstr);
        fiyatDouble/=100;
        System.out.println(fiyatDouble);

        if (fiyatDouble>=40 && fiyatDouble<=200){

            System.out.println("Fiyat 200/400 testi Passed!");
        }  else System.out.println("Fiyat 200/400 testi Failed!");

        //12-Sayfayi kapatin


        Thread.sleep(2000);
        driver.quit();
    }
}
