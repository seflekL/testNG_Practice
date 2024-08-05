package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C02_locators {
    public static void main(String[] args) {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chorme.drive", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 2- http://zero.webappsecurity.com/ adresine gidin


        driver.get("http://zero.webappsecurity.com/");


        // 3- “ONLINE BANKING” linkine tiklayin


        driver.findElement(By.id("onlineBankingMenu")).click();

        // 4- Resim altinda 6 islem basligi oldugunu test edin


        List<WebElement> islemBasiliklarList = driver.findElements(By.className("headers"));
        int exptectedBaslikSayisi = 6;
        if (islemBasiliklarList.size() == exptectedBaslikSayisi) {
            System.out.println("Baslik Sayisi testi passed");

        } else System.out.println("Baslik testi failied");
        // 5- Islem basliklari icinde “Pay Bills” oldugunu test edin
        //1.yontem loop ile tum web elementleri uzerinde yazialri alip olusturaagimiz listeye koyabilir
        //contains mehtodunu kullana biliriz  "Pay bills" iceriyor mu bakabilirz
        List<String> islemIsimleriListesi = ReusableMethods.getStringList(islemBasiliklarList);
        if (islemIsimleriListesi.contains("Pay Bills")) {
            System.out.println("Pay Bills testi PASSED");
        } else System.out.println("Pay Bills testi FAILED");

        //2.yontem flag  boolean paybillvarmi = varmi for each loop ile her web elementin yazisini
        //kontrol edelim Pay bills olan varsa flag true yapalim looop bitince


        boolean payBillVarmi = false;


        for (WebElement eachElement : islemBasiliklarList) {
            if (eachElement.getText().equalsIgnoreCase("Pay Bills")) {
                payBillVarmi = true;

            }
        }
        if (payBillVarmi == true) {
            System.out.println("Pay Bills testi PASSED");
        } else System.out.println("Pay Bills testi FAILED");


        // 6- Sayfayi kapatin
        driver.quit();
    }

}