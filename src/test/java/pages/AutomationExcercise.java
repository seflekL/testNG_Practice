package pages;

import org.checkerframework.checker.units.qual.Force;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverListener;
import utilities.Driver;

import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;

public class AutomationExcercise {

    public AutomationExcercise() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='logo pull-left']")
    public WebElement logoElementi;

    @FindBy (xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLoginButtonElementi;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignupTextElementi;

    @FindBy (xpath = "//*[@data-qa='signup-name']")
    public  WebElement signupNameBoxElementi;

    @FindBy (xpath = "//*[@data-qa='signup-email']")
    public WebElement signupEmailboxElementi;

    @FindBy (xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButtonElementi;

    @FindBy(xpath = "(//*[@class='title text-center'])[1]")
    public WebElement EnterAccountInfoElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement nameBoxWebelementi;

    @FindBy (xpath = "(//*[@class='form-control'])[3]" )
    public WebElement passwordBoxElementi;

    @FindBy (xpath = "//*[@id='days']")
    public WebElement dayDDMElementi;

    @FindBy (xpath = "//*[@id='months']")
    public WebElement monthDDMElementi;

    @FindBy (xpath = "//*[@id='years']" )
    public WebElement yearsDDMElementi;

    @FindBy (xpath = "//*[@id='newsletter']")
    public WebElement signupCheckBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[7]")
    public WebElement  adressfirstnameBoxinElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[8]" )
    public WebElement adresslastnameBoxinElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[9]" )
    public WebElement adresscompanyBoxinElementi;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    public WebElement adressAdressElementi;
    @FindBy (id = "country")
    public WebElement adresscontryDDMElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[13]")
    public WebElement addresstateAdressBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[14]" )
    public WebElement adresscityBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[15]")
    public WebElement addressZipboxElementi;

    @FindBy (xpath= "(//*[@class='form-control'])[16]")
    public WebElement adressMobileElementi;

    @FindBy (xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement createbuttonElementi;

    @FindBy (xpath = "//*[@id='id_gender1']")
    public WebElement mrBoxbuttonElementi;
    @FindBy (xpath = "//*[@id='optin']")
    public WebElement receiveSpecialButtonElementi;

    @FindBy (xpath = "//*[@id=\"mobile_number\"]")
    public WebElement adressMobileElementi2;

    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedTextWebElementi;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinASElementi;

    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement deleteAccountElementi;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement deleteAccountVerificationElementi;


    @FindBy (xpath = "//*[text()='Login']")
    public WebElement logintoyouraccountLoginButtonElementi;

    @FindBy (xpath = "(//*[@name='email'])[1]")
    public WebElement logintoyouraccountEmailBoxElementi;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement logintoyouraccountPasswordBoxElementi;

}
