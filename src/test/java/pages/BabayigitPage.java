package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BabayigitPage {

    public BabayigitPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

            @FindBy (id = "search")
            public WebElement searchboxElementi;

            @FindBy (id = "hdtb-tls")
            public WebElement googleToolsElementi;

            @FindBy (id="result-stats")
            public WebElement googleResultsStatsElementi;

}
