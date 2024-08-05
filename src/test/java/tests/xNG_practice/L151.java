package tests.xNG_practice;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseEach;

import java.time.Duration;

public class L151 extends TestBaseEach {

    @Test

    public void test01() throws InterruptedException {

      //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
      //2- Cookies kabul edelim
      //3- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
      //4- Ad, soyad, mail ve sifre kutularina deger
        Faker faker=new Faker();
        int number1=1;
        int number2=31;
        int randomNumber=faker.number().numberBetween(number1,number2);
        String email=faker.internet().emailAddress();
        String password=faker.internet().password();
        WebElement nameBox= driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        Actions actions=new Actions(driver);
        actions.sendKeys(nameBox).click()
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Jan")
                .sendKeys(Keys.TAB)
                .sendKeys("1984").perform();
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement  maleBox= driver.findElement(By.xpath("(//*[@class='_58mt'])[2]"));
         maleBox.click();
         wait.until(ExpectedConditions.elementToBeClickable(maleBox));

         WebElement signup=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
         wait.until(ExpectedConditions.elementToBeClickable(signup));
         signup.click();






        //yazalim ve kaydol tusuna basalim
      //5- Kaydol tusuna basalim

    }

}
