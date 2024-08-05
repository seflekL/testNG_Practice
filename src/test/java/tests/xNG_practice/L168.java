package tests.xNG_practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseEach;

import java.time.Duration;

public class L168 extends TestBaseEach {
    @Test
    public void test01() {


//1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//2. Remove butonuna basin.
        driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']")).click();

//3. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        WebElement msgElement=driver.findElement(By.xpath("//*[@id='message']"));
        Assertions.assertTrue(msgElement.isDisplayed());

//4. Add buttonuna basin
        driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        //5. It’s back mesajinin gorundugu

        WebElement backMSg= driver.findElement(By.xpath("//*[@id=\"message\"]"));
        Assertions.assertTrue(backMSg.isDisplayed());

}}

