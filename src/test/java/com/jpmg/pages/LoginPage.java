package com.jpmg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static By usernameLocator = By.id("authUser");
    private static By passwordLocator = By.id("clearPass");
    private static By loginLocator = By.cssSelector("button[type='submit']");
    private static By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");

    public static void enterUsername(WebDriver driver, String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public static void enterPassword(WebDriver driver, String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public static void clickOnLogin(WebDriver driver) {
        driver.findElement(loginLocator).click();
    }

    public static String getErrorMessage(WebDriver driver) {
        return driver.findElement(errorLocator).getText();
    }

}
