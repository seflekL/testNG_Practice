package tests.day12_excelOtomasyon_Screenshot_JsExecutor;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.TestBaseEach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class L01_deneme extends TestBaseEach {

    @Test

    public void test01() throws IOException {

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.home"));


        String dosyaYolu = "src/test/java/day11_webTables_excelOtomasyonu/ulkeler (1).xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sayfa1 = workbook.getSheet("Sayfa1");

        System.out.println(sayfa1.getRow(0).getCell(1).toString());
        System.out.println(sayfa1.getRow(0).getCell(2).toString());
        String expectedtext = "Başkent (İngilizce)";
        String actualtext = sayfa1.getRow(0).getCell(1).toString();
        Assertions.assertEquals(expectedtext, actualtext);
        String expectedbaslentKabil = "Kabil";
        String actualtext2 = sayfa1.getRow(1).getCell(3).toString();
        Assertions.assertEquals(expectedbaslentKabil, actualtext2);
        int number = 190;
        int actualnumber = sayfa1.getLastRowNum() + 1 - 1;
        Assertions.assertEquals(number, actualnumber);


        String satirdakiTurkceBaskent = "";
        boolean flag = false;
        for (int i = 1; i <= sayfa1.getLastRowNum(); i++) {
            satirdakiTurkceBaskent = sayfa1.getRow(i).getCell(3).toString();
            if (satirdakiTurkceBaskent.equalsIgnoreCase("Ankara")) ;
            flag = true;
            break;
        }

        Assertions.assertTrue(flag);

        //olmasi gereken 2. yol

        Map<String, String> ulkelerMap = new TreeMap<>();

        for (int i = 1; i <= sayfa1.getLastRowNum(); i++) {

            String satirdakiIngilizceUlkeIsmi = sayfa1.getRow(i).getCell(0).toString();
            String satirdakiTurkceBaskentIsmi = sayfa1.getRow(i).getCell(1).toString();

            ulkelerMap.put(satirdakiIngilizceUlkeIsmi, satirdakiTurkceBaskentIsmi);

        }
        System.out.println(ulkelerMap);
    }
    @Test
    public void test02() throws IOException {
        String dosyayolu = "src/test/java/day11_webTables_excelOtomasyonu/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(dosyayolu);
        Workbook workbook=WorkbookFactory.create(fis);
        Sheet sayfa1=workbook.getSheet("Sayfa1");
        //4) 1.satir 5.hucreye yeni bir cell olusturalim

        sayfa1.getRow(0).createCell(4);
        sayfa1.getRow(0).getCell(4).setCellValue("deneme");
        //6) 2.satir nufus kolonuna 1500000 yazdiralim

        sayfa1.getRow(1).createCell(4).setCellValue(1000);
        sayfa1.getRow(9).createCell(4).setCellValue(5555);

        FileOutputStream fos= new FileOutputStream(dosyayolu);
        workbook.write(fos);
        fis.close();
        fos.close();
        workbook.close();


    }

    @Test
    public void test03(){

        driver.get("");

    }
}
