package com.jpmg.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    //converts sheet into Object[][]
    public static Object[][] getSheetIntoTwoDimensionalArray(String fileDetail, String sheetname) throws IOException {

        FileInputStream file = new FileInputStream(fileDetail);

        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet(sheetname);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
        DataFormatter format = new DataFormatter();

        Object[][] main = new Object[rowCount - 1][cellCount];
        for (int r = 1; r < rowCount; r++) {
            for (int c = 0; c < cellCount; c++) {
                String value = format.formatCellValue(sheet.getRow(r).getCell(c));
                main[r - 1][c] = value;
            }
        }
        return main;
    }


}
