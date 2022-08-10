package com.jpmg.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//will be deleted
//not part of framework
public class Demo2 {
    public static void main(String[] args) throws IOException {

        //location - read
        FileInputStream file = new FileInputStream("test_data/openemr_data.xlsx");
        //open
        XSSFWorkbook book = new XSSFWorkbook(file);

        //sheet
        XSSFSheet sheet = book.getSheet("validCredentialTest");

        //cell value 1 and 0
//        String value = sheet.getRow(1).getCell(0).getStringCellValue();
//        System.out.println(value);

        for(int r=1;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                String value = sheet.getRow(r).getCell(c).getStringCellValue();
                System.out.println(value);
            }
        }

        System.out.println("Excel Demo");

    }
}
