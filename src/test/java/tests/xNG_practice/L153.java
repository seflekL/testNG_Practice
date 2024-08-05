package tests.xNG_practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L153 extends TestBaseEach {

    @Test

    public void test01(){


//1- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
//2- video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(4);

//3- videoyu izlemek icin Play tusuna basin
       WebElement ytIframe=driver.findElement(By.xpath("(//iframe)[1]"));
       driver.switchTo().frame(ytIframe);
       WebElement playButtonElement=driver.findElement(By.xpath("//*[@title='Play']"));
        ReusableMethods.bekle(4);

        playButtonElement.click();
        ReusableMethods.bekle(4);

//4- videoyu calistirdiginizi test edin
        Assertions.assertTrue(playButtonElement.isEnabled());
        }
}
