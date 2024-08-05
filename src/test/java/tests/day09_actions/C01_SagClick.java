//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day09_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class C01_SagClick extends TestBaseEach {
    public C01_SagClick() {
    }

    @Test
    public void test01() {
        driver.get("https://testotomasyonu.com/click");
        Actions actions = new Actions(this.driver);
        WebElement cgiDronesElementi = this.driver.findElement(By.id("pic2_thumb"));
        ReusableMethods.bekle(1);
        actions.contextClick(cgiDronesElementi).perform();
        String expectedAlertYazisi = "Tebrikler!... Sağ click yaptınız.";
        String actualAlertYazisi = this.driver.switchTo().alert().getText();
        Assertions.assertEquals(expectedAlertYazisi, actualAlertYazisi);
        this.driver.switchTo().alert().accept();
    }
}
