package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_findElements {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // testotomasyonu anasayfaya gidin

        driver.get("https://testotomasyonu.com/");

        // phone icin arama yapin

        WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin

        List<WebElement>bulunanElementleriList=driver.findElements(By.className("prod-img"));

        if (bulunanElementleriList.size()>0) {

            System.out.println("Urun Sayisi Testi Passed!");
        } else System.out.println("Urun Sayisi Testi Failed!");

        /*
            By.className kullanildiginda
            EGER class attribute'unun value'su space iceriyorsa
            By.classname CALISMAYABILIR
         */


        // bulunan tum urunlerin isimlerini yazdirin

        // System.out.println(bulunanUrunElementleriList);
        /*
            findElements() bize WebElement'lerden olusan bir liste getirir
            bu listeyi yazdirmak istedigimizde
            direk yazdirirsak, liste webElementlerden olustugundan referanslarini yazdirir

            eger her bir webelement'in uzerindeki text'i almak istersek
            her elemani bir loop ile tek tek ele alip
            getText() ile uzerindeki yaziyi kullanabiliriz

            Her elamami loop ile tek tek yazilmasi gereiyor each veya for loop

                     */


        /*
            Her webElement yazi icermeyebilir
            urun ismini iceren webelement'lerin class attribute degerleri space icerdiginden
            bu maddeyi xPath ile yapmak uzere pass geciyoruz
         */


        for (WebElement eachElement : bulunanElementleriList) {

            System.out.println(eachElement.getText()); // bosluk oldugu icin cikmayacaktir
        }

        // ilk urunu tiklayin
        // tum urunleri liste olarak kaydettigimiz icin
        // listedeki ilk urune tiklamamiz yeterli olacaktir

        bulunanElementleriList.get(0)
                              .click();

        // ilk urun sayfasinda, urun isminde case sensitive olmadan "phone" bulundugunu test edin

        WebElement urunDetaylariElementi= driver.findElement(By.className("prod-detail"));

        String  expectedUrunIsimIcerigi="phone";
        String  actualUrundetaylari= urunDetaylariElementi.getText().toLowerCase();

        if (actualUrundetaylari.contains(expectedUrunIsimIcerigi)){
            System.out.println("Urun Icerik Testi Passed!");
        } else System.out.println("Urun Icerik Testi Failed!");




    }
}