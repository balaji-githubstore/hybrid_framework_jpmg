package com.jpmg.test;
//not part of framework - will be deleted
// no need to create

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {

    @DataProvider
    public Object[][] validData() {

        Object[][] main = new Object[3][2];
        main[0][0] = "John";
        main[0][1] = "John123";

        main[1][0] = "peter";
        main[1][1] = "peter123";

        main[2][0] = "mark";
        main[2][1] = "mark123";

        return main;
    }

    @Test(dataProvider = "validData")
    public void validTest(String username, String password) {
        System.out.println("valid" + username + password);
    }
}
