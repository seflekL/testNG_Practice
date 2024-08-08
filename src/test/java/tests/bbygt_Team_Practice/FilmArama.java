package tests.bbygt_Team_Practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.BabayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FilmArama {
    String filmName = "";

    //https://www.babayigit.net/test adresine gidin
    //1-arama kutusuna "12 Angry Men" yazip, cikan sonuc sayisini yazdirin
    //2-arama kutusuna "Vizontele" yazip, cikan sonuc sayisini yazdirin
    //3-arama kutusuna "Saving Private Ryan" yazip, cikan sonuc sayisini yazdirin
    @Test
    public void TC01filmaArma() {

        BabayigitPage babayigitPage = new BabayigitPage();
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        filmName = "12 Angry Men";
        babayigitPage.searchboxElementi.sendKeys(filmName + Keys.ENTER);
        babayigitPage.googleToolsElementi.click();
        System.out.println(babayigitPage.googleResultsStatsElementi.getText());

     }

    @Test
    public void TC02filmaArma() {

        BabayigitPage babayigitPage = new BabayigitPage();
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        filmName = "Vizontele";
        babayigitPage.searchboxElementi.sendKeys(filmName + Keys.ENTER);
        babayigitPage.googleToolsElementi.click();
        System.out.println(babayigitPage.googleResultsStatsElementi.getText());

     }

    @Test
    public void TC03filmaArma() {

        BabayigitPage babayigitPage = new BabayigitPage();
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        filmName = "Saving Private Ryan";
        babayigitPage.searchboxElementi.sendKeys(filmName + Keys.ENTER);
        babayigitPage.googleToolsElementi.click();
        System.out.println(babayigitPage.googleResultsStatsElementi.getText());

     }


}
