package com.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tamil.gpt51@gmail.com");
        loginPage.enterPassword("Ishutamil");
        loginPage.clickLogin();

        
        String expectedUrl = "https://www.facebook.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login Success");
    }
}
