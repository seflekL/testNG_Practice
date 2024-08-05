package tests.bbygt_Team_Practice.day02;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    static WebDriver driver;
    static String email="xx@xx.com";
    static String passWo="147893";
    Faker faker=new Faker();
    @BeforeAll
    public static void setup(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
            @AfterAll
    public static   void teardown(){
        driver.quit();
            }

       @BeforeEach
    public void beforetest(){
        driver.get("https://www.automationexercise.com/");
       }
       @AfterEach
    public void aftereach(){
           System.out.println("Test mamalandi Sonuclari kontol ediniz");
       }

       @Test
    public void test01(){

           driver.findElement(By.xpath("//a[@href='/login']")).click();
           driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Murat");
           driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys(email);
           driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
           driver.findElement(By.id("password")).sendKeys("pass");
           driver.findElement(By.id("first_name")).sendKeys("Murat");
           driver.findElement(By.id("last_name")).sendKeys("Yiğit");
           driver.findElement(By.id("address1")).sendKeys(faker.address().fullAddress());
           driver.findElement(By.id("state")).sendKeys(faker.address().state());
           driver.findElement(By.id("city")).sendKeys(faker.address().city());
           driver.findElement(By.id("zipcode")).sendKeys(faker.address().zipCode());
           driver.findElement(By.id("mobile_number")).sendKeys(faker.phoneNumber().phoneNumber());
           driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
           String expectedResult="Account Created!";
           String actualResult=driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();

       }

}
