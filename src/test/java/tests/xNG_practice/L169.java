package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.time.Duration;

public class L169 extends TestBaseEach {

    @Test

    public void test01 () {

       // 1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
       // 2. "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement hooElement= driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
        actions.moveToElement(hooElement).perform();

       // 3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();

        // 4. Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        // 5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
       // 6. "Click and hold" kutusuna basili tutun
       WebElement clickholdElement= driver.findElement(By.xpath("//*[@id='click-box']"));
        actions.clickAndHold(clickholdElement).perform();
       // 7. "Click and hold" kutusunda cikan yaziyi yazdirin
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));

        System.out.println(clickholdElement.getText());

        // 8. "Double click me" butonunu cift tiklayin
        WebElement  ciftElement= driver.findElement(By.tagName("h2"));
        actions.doubleClick(ciftElement).perform();

        ReusableMethods.bekle(4);

    }
}
