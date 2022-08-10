package com.jpmg.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataUtils {
    @DataProvider
    public Object[][] validCredentialData() throws IOException {
//        Object[][] main = new Object[2][3];
//        main[0][0] = "admin";
//        main[0][1] = "pass";
//        main[0][2] = "OpenEMR";
//
//        main[1][0] = "physician";
//        main[1][1] = "physician";
//        main[1][2] = "OpenEMR";

        Object[][] main= ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/openemr_data.xlsx","validCredentialTest");
        return main;
    }

    @DataProvider
    public Object[][] invalidCredentialData()
    {
        Object[][] main=new Object[2][3];

        main[0][0]="john";
        main[0][1]="john123";
        main[0][2]="Invalid username or password";

        main[1][0]="peter";
        main[1][1]="peter123";
        main[1][2]="Invalid username or password";

        return main;
    }
}
