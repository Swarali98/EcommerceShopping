package resuable;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String fetchData(String sheetname, int row, int coln) throws IOException {
        FileInputStream xlsdata = new FileInputStream(new File("src/test/resources/testData/Data.xlsx"));
        XSSFWorkbook xlswkbk = new XSSFWorkbook(xlsdata);
        XSSFSheet xlssheet = xlswkbk.getSheet(sheetname);
        String value = new DataFormatter().formatCellValue(xlssheet.getRow(row).getCell(coln));
        return value;
    }

}
