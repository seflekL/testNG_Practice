package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L152 extends TestBaseEach {

    @Test

    public void test01() throws InterruptedException {


//1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
//2- Hover over Me First" kutusunun ustune gelin
        WebElement hButtonElement = driver.findElement(By.xpath("(//*[@class=\"dropbtn\"])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hButtonElement).perform();
        //3- Link 1" e tiklayin
        driver.findElement(By.xpath("(//*[text()='Link 1'])[1]")).click();
//4- Popup mesajini yazdirin

        String textalert = driver.switchTo().alert().getText();
        System.out.println(textalert);
//5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().dismiss();
//6- “Click and hold" kutusuna basili tutun

//7-“Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement clickBox = driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickBox);


//8- “Double click me" butonunu cift tiklayin
        WebElement doubleElemen = driver.findElement(By.id("double-click"));

        actions.doubleClick(doubleElemen).perform();
        ReusableMethods.bekle(5);
    }
}
