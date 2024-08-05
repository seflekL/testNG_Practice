package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class DemoqaPage {

    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy (className = "rt-resizable-header-content")
    public List<WebElement>headerList;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div")
    public List<WebElement>tablodataList;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div")
    public List<WebElement>tablosatirList;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div/div[3]")
    public List<WebElement>ucuncuSutunList;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[5]" )
    public WebElement kierraSalary;
}
