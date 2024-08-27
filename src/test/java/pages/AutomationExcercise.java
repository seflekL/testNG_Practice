package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement loginincorrectemailPassTextElementi;

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement logoutButtonElementi;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
    public  WebElement emailAdressAlreadyExistElemneti;

    @FindBy (xpath = "//*[@class='fa fa-envelope']")
    public WebElement contactUsElementi;

    @FindBy (xpath = "//*[text()='Get In Touch']")
    public WebElement contactUSgetintouchTextElmenti;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public  WebElement contactUsNameboxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[2]")
            public  WebElement contactUsEmailBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[3]")
    public  WebElement contactUSsubjectBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[4]")
    public  WebElement contactUsBodyBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[5]")
    public  WebElement contactUSChooseFileBoxElementi;

    @FindBy (xpath = "//*[@name='submit']")
    public WebElement contactUsSubmitButtonElementi;

    @FindBy (xpath = "//*[@class='status alert alert-success']")
    public WebElement contactUsSuccesTextElementi;

    @FindBy (xpath = "//*[@class='btn btn-success']")
    public WebElement contactUSHomeButton;

    @FindBy (xpath = "(//*[@class='fa fa-list'])[1]")
    public WebElement  testcaseLoginButton;
    @FindBy (xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    public WebElement testCaseTitle;
    @FindBy (xpath = "//*[text()= ' Products']")
    public WebElement productLinkElementi;
    @FindBy (id = "sale_image")
    public WebElement categoryMainLogo;

    @FindBy (xpath = "//*[@class='product-image-wrapper']")
    public List<WebElement> categoryproductList;

    @FindBy  (xpath = "//*[text()= 'View Product'][1]")
    public WebElement categoryFirstProductLink;

    @FindBy(xpath = "//body//section//p[4]")
    public WebElement categoryFirstProductBrandElementi;

    @FindBy (xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")
    public WebElement categoryFirstProductCategoryElementi;

    @FindBy (xpath = "//*[text()= 'Rs. 500']")
    public WebElement categoryFirstProductPriceElementi;

    @FindBy (xpath = "//div[@class='product-details']//p[2]")
    public WebElement categoryFirstProductavaibilityStock;

    @FindBy (xpath = "//body//section//p[3]")
    public WebElement categoryFristProductCondtionElementi;

    @FindBy (id = "search_product")
    public WebElement categorysearchProductBoxElementi;

    @FindBy (id = "submit_search")
    public WebElement getCategorysearchProductBoxButtonElementi;

    @FindBy (xpath = "//*[text()='Subscription']")
    public WebElement footerSubscriptionTextElementi;

    @FindBy (id = "susbscribe_email")
    public WebElement  footersubscribeEmailBox;

    @FindBy (xpath = "//*[@id='subscribe']")
    public WebElement footersubscribeButton;

    @FindBy (xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement headerCartButtonElementi;

    @FindBy (xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement categoryfirstProductAddtoCartButtonElementi;

    @FindBy (xpath = "//*[text()='Continue Shopping']")
    public WebElement categoryContinueShoppingButtonElementi;

    @FindBy (xpath = "(//*[@class='single-products'])[2]")
    public  WebElement categorySeccondProductLinkWebElementi;

    @FindBy (xpath = "(//*[@class='fa fa-shopping-cart'])[4]")
    public WebElement categorySeccondProductAddCartButtonElementi;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement categorySeccondProductAddtoCartLink;

    @FindBy (xpath = "//*[@class='cart_description']")
    public List<WebElement> categoryproductListcartList;

   @FindBy (id = "product-1")
    public List<WebElement> cartProduct1List;

   @FindBy (xpath = "(//*[@class='cart_price'])[1]")
    public WebElement cartProduct1PriceElementi;

    @FindBy (xpath = "(//*[@class='cart_price'])[2]")
    public WebElement cartProduct2PriceElementi;

    @FindBy (xpath = "(//*[@class='cart_quantity'])[1]")
    public WebElement cartProduct1QuantityElementi;

    @FindBy (xpath = "(//*[@class='cart_quantity'])[2]")
    public WebElement cartProduct2QuantityElementi;

    @FindBy (xpath = "(//*[@class='cart_total_price'])[1]")
    public  WebElement getCartProduct1TotalPriceElementi;

    @FindBy (xpath = "(//*[@class='cart_total_price'])[2]")
    public  WebElement getCartProduct2TotalPriceElementi;

    @FindBy (id = "quantity")
    public WebElement  cartProductQuatityBoxElementi;

    @FindBy (xpath = "//*[@class='btn btn-default cart']")
    public WebElement addtocartButton;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewcartButtonElementi;
    @FindBy (className = "disabled")
    public WebElement cartQuantityBoxElementi;
    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedcheckoutButtonElementi;
    @FindBy (xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButtonElementi;
    @FindBy (xpath = "//*[text()='Continue']")
    public WebElement accountcreatedContinueButtonElementi;
    @FindBy (xpath = "//*[text()='Your delivery address']")
    public WebElement yourdeliveryaddressTExtElementi;
    @FindBy (className = "form-control")
    public WebElement  checkoutpageBodyBoxElementi;
    @FindBy (xpath = "//*[@name='name_on_card']")
    public WebElement paymentnameOntheCardBox;
    @FindBy (xpath = "//*[@name='card_number']")
    public WebElement paymentCardNumberBoxElementi;
    @FindBy (xpath = "//*[@name='cvc']")
    public WebElement paymenCVCboxElementi;
    @FindBy (xpath = "//*[@name='expiry_month']")
    public WebElement paymentExpirationBoxElementi;
    @FindBy (xpath = "//*[@name='expiry_year']")
    public WebElement paymentYearCardBoxElementi;
    @FindBy (id = "submit")
    public WebElement paymentPayandConfirmButtonElementi;

    @FindBy (xpath = "//*[@class='cart_description']")
    public WebElement checkoutItemDescriptionBoxElementi;

    @FindBy (xpath = "//*[text()='Place Order']")
    public WebElement checkoutPlaceOrderButtonElementi;

    @FindBy (xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement paymentdonepageCongratulationsorderconfirmedTextButton;

    @FindBy (xpath = "//*[text()='Continue']")
    public WebElement paymentDonneContinueButtonElementi;

    @FindBy (xpath = "//*[@class='cart_quantity_delete']")
    public WebElement cartScreenRemoveButonElmenti;

    @FindBy (id = "empty_cart")
    public WebElement cartScreenEmpyCartScreenText;

    @FindBy (xpath = "//*[text()='Category']")
    public WebElement leftsidebarCategoriesTextElementi;

    @FindBy (xpath = "(//*[@class='fa fa-plus'])[1]")
    public WebElement leftsidebarPLUSsignButonELementi;

    @FindBy(xpath = "//a[normalize-space()='Women']")
    public WebElement leftsidebarWomenButonElementi;

    @FindBy (xpath = "//a[normalize-space()='Tops']")
    public WebElement leftsidebarWomenTopProductsButtonu;

    @FindBy (xpath = "//span[@class='google-anno-t']")
    public WebElement womenTopProductsTextElementi;

    @FindBy (xpath = "//a[normalize-space()='Men']")
    public WebElement leftsidebarsidebarMenButtonElementi;

    @FindBy (xpath = "//a[normalize-space()='Jeans']")
    public WebElement leftsidebarmenJeanButtonelementi;

    @FindBy (xpath = "//*[text()='Men - Jeans Products']")
    public WebElement  menJeansProductstTitleElementi;

    @FindBy (id = "search_product")
    public WebElement productSearchBoxelementi;

    @FindBy (id = "submit_search")
    public WebElement productSearchBoxButtonElementi;

    @FindBy (xpath = "//*[@class='productinfo text-center']")
    public List<WebElement> searchResultJeanList;

    @FindBy (xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addtocart1Elementi;

    @FindBy (xpath = "(//*[text()='Add to cart'])[3]")
    public WebElement addtocart2Elementi;

    @FindBy (xpath = "(//*[text()='Add to cart'])[5]")
    public WebElement addtocart3Elementi;

    @FindBy (xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public  WebElement continueShoppingButtonElmenti;

    @FindBy(id = "product-33")
    public  List<WebElement> checkout1itemList;
    @FindBy(id = "product-35")
    public  List<WebElement> checkout2itemList;
    @FindBy(id = "product-37")
    public  List<WebElement> checkou31itemList;

    @FindBy (id="cart_info_table")
    public List<WebElement>cartList;




















}
