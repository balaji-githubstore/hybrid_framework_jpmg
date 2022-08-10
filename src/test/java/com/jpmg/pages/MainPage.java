package com.jpmg.pages;

import org.openqa.selenium.WebDriver;

public class MainPage {

    public static String getMainPageTitle(WebDriver driver)
    {
        return driver.getTitle();
    }
}
