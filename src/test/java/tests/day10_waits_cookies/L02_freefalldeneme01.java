package tests.day10_waits_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;



public class L02_freefalldeneme01 {

    WebDriver driver;
    @Test
    public void test01(){
        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //2. Textbox’in etkin olmadigini(enabled) dogrulayın

        WebElement textBox= driver.findElement(By.xpath("//*[@type='text']"));
        Assertions.assertFalse(textBox.isEnabled());

        //3. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebElement enablebutton= driver.findElement(By.xpath("(//*[@type='button'])[2]"));
        enablebutton.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(enablebutton));



        //4. Textbox’in etkin oldugunu(enabled) dogrulayın.

        Assertions.assertTrue(textBox.isEnabled());

        //5. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement enableText=driver.findElement(By.xpath("//*[text()=\"It's enabled!\"]"));
        Assertions.assertTrue(enableText.isDisplayed());

        ReusableMethods.bekle(3);
        driver.quit();
    }




    public void test2(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
}

