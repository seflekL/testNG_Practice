package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage_iFrame {

    public WebUniversityPage_iFrame (){ PageFactory.initElements(Driver.getDriver(),this);

    }

   @FindBy (xpath = "//*[text()='Our Products']")
    public WebElement ourproductButtonElementi;

    @FindBy (xpath = "//*[@id=\"container-product1\"]/div[1]/p")
    public WebElement cameraslinkElementi;

    @FindBy (xpath = "//a[@id='nav-title'][1]")
    public WebElement iframeLinkElementi;






}
