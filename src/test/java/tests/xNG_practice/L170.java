package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.WebUniversityPage_iFrame;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L170 extends TestBaseEach {

    @Test
    public void test01 (){
        WebUniversityPage_iFrame webUniversityPageIFrame=new WebUniversityPage_iFrame();

//1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("iFrame"));
////2. “Our Products” butonuna basin3
        WebElement iframeOurElementi=Driver.getDriver().findElement(By.xpath("//iframe[@id='frame']"));
        Driver.getDriver().switchTo().frame(iframeOurElementi);
        Driver.getDriver().findElement(By.xpath(" //a[normalize-space()='Our Products']")).click();

        ReusableMethods.bekle(5);
         ////3. “Cameras product”i tiklayin
    webUniversityPageIFrame.cameraslinkElementi.click();

////4. Popup mesajini yazdirin
        List<WebElement> inBoxtext=Driver.getDriver().findElements(By.className("modal-body"));
        System.out.println(ReusableMethods.getStringList(inBoxtext));
        ////5. “close” butonuna basin
        Driver.getDriver().findElement(By.xpath("//button[normalize-space()='Close']")).click();
 ////6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        Driver.getDriver().switchTo().defaultContent();
        webUniversityPageIFrame.iframeLinkElementi.click();
 ////7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        Driver.getDriver().findElement(By.xpath("//a[@id='nav-title']")).click();

        String expectedUrl="https://webdriveruniversity.com/index.html";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

   }
}
