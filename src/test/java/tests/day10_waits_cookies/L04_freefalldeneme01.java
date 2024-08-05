package tests.day10_waits_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBaseEach;

import java.util.Set;

public class L04_freefalldeneme01 extends TestBaseEach {


    @Test
    public void test01(){
        // facebook anasayfaya gidin

        driver.get("https://www.facebook.com");

        Cookie yeniCookie= new Cookie("ensevidigim","seniz");
        Cookie yeni2=new Cookie("yeniturku","destina");
        driver.manage().addCookie(yeniCookie);
        driver.manage().addCookie(yeni2);
        Set<Cookie> cookieset=driver.manage().getCookies();
        for (Cookie cookieeachSet : cookieset) {
            System.out.println(cookieeachSet);
        }

        }


    }

