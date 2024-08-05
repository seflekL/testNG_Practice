package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class L179 {

    @Test
    public void test01(){

     //1. “https://testotomasyonu.com/webtables2” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrlwebtable"));
        // 2. Headers da bulunan basliklari yazdirin
      List <WebElement> headerBaslik=Driver.getDriver().findElements(By.className("has-sub"));
        System.out.println(ReusableMethods.getStringList(headerBaslik));
        headerBaslik.remove(0);
        System.out.println(ReusableMethods.getStringList(headerBaslik));

        // 3. 3.sutunun basligini yazdirin
        System.out.println(Driver.getDriver().findElement(By.xpath("//*[@role='hdata'][3]")).getText());
        List<WebElement>tumtabloList=Driver.getDriver().findElements(By.xpath("//div[@role='tdata']"));
        // 4. Tablodaki tum datalari yazdirin
        System.out.println(ReusableMethods.getStringList(tumtabloList));

        // 5. Tabloda kac tane cell (data) oldugunu yazdirin
        List <WebElement> cellData=Driver.getDriver().findElements(By.xpath("//div[@role='hdata']"));
        System.out.println(cellData.size());
        // 6. Tablodaki satir sayisini yazdirin
        List <WebElement> sutun=Driver.getDriver().findElements(By.className("ms-3"));
        System.out.println(sutun.size());


        // 7. Tablodaki sutun sayisini yazdirin
        // 8. Tablodaki 3.kolonu yazdirin
        // 9. Tabloda " Category" si Furniture olan urunun fiyatini yazdirin
        //10. Bir method olusturun, Test sayfasindan satir ve sutun verildiginde datayi yazdirsin
        Driver.quitDriver();

    }
}
