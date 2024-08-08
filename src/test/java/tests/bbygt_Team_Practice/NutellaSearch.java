package tests.bbygt_Team_Practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.BabayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NutellaSearch {

    @Test
    public void TC01nutellaSearch () {
        BabayigitPage babayigitPage=new BabayigitPage();

        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));

        babayigitPage.searchboxElementi.sendKeys("Nutella"+ Keys.ENTER);


    }
    @Test
    public  void TC02wiseSearch (){
        BabayigitPage babayigitPage=new BabayigitPage();

        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));

        babayigitPage.searchboxElementi.sendKeys("WiseQuarter" + Keys.ENTER);
    }



}
