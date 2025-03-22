package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

   
    private By usernameField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.name("login");

   
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
