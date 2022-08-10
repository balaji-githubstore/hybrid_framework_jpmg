package com.jpmg.test;

import com.jpmg.base.AutomationWrapper;
import com.jpmg.pages.LoginPage;
import com.jpmg.pages.MainPage;
import com.jpmg.utilities.DataUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends AutomationWrapper {

    @Test(dataProvider = "validCredentialData",dataProviderClass = DataUtils.class)
    public void validCredentialTest(String username, String password, String expectedTitle) {

        LoginPage.enterUsername(driver,username);
        LoginPage.enterPassword(driver,password);
        LoginPage.clickOnLogin(driver);

        String actualTitle = MainPage.getMainPageTitle(driver);

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "invalidCredentialData",dataProviderClass = DataUtils.class)
    public void invalidCredentialTest(String username, String password, String expectedError) {

        LoginPage.enterUsername(driver,username);
        LoginPage.enterPassword(driver,password);
        LoginPage.clickOnLogin(driver);

        String actualError = LoginPage.getErrorMessage(driver);

        Assert.assertTrue(actualError.contains(expectedError));
    }

}
