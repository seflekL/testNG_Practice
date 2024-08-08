package tests.bbygt_Team_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BabayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class B_Assertion {

    @Test
    public void test01 (){
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        BabayigitPage babayigitPage=new BabayigitPage();

        String expectedIcerik="!Testing";
        String actualTitle=Driver.getDriver().getTitle();

        String expectedUrl="https://www.babayigit.net/test/";
        String acutalUrl=Driver.getDriver().getCurrentUrl();

       // Assert.assertTrue(actualTitle.contains(expectedIcerik));
        SoftAssert softAssert=new SoftAssert();

         softAssert.assertEquals(acutalUrl,expectedUrl);
        softAssert.assertTrue(actualTitle.contains(expectedIcerik));
        softAssert.assertAll();
    }
}
