package tests.xNG_practice;

import org.junit.jupiter.api.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class L180 {

    @Test
    public void test180(){
        DemoqaPage demoqaPage=new DemoqaPage();
        //1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        // 2. Headers da bulunan basliklari yazdirin
        System.out.println(ReusableMethods.getStringList(demoqaPage.headerList));;
        // 3. 3.sutunun basligini yazdirin
        System.out.println(demoqaPage.headerList.get(2).getText());
        // 4. Tablodaki tum datalari yazdirin
        System.out.println(ReusableMethods.getStringList(demoqaPage.tablodataList));
        // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<String>stringList=ReusableMethods.getStringList(demoqaPage.tablodataList);
        System.out.println(stringList);

         // 6. Tablodaki satir sayisini yazdirin
        System.out.println(demoqaPage.tablosatirList.size());
        // 7. Tablodaki sutun sayisini yazdirin
        System.out.println(demoqaPage.headerList.size());
        // 8. Tablodaki 3.kolonu yazdirin
        System.out.println("ReusableMethods.getStringList(demoqaPage.ucuncuSutunList) = " + ReusableMethods.getStringList(demoqaPage.ucuncuSutunList));
        List<String>ucuncusutunstr=ReusableMethods.getStringList(demoqaPage.ucuncuSutunList);
        System.out.println(ucuncusutunstr);
         // 9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        System.out.println(demoqaPage.kierraSalary.getText());

    Driver.quitDriver();

    }

}
