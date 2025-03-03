package ddtStarted;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String fetchDataFromExcel(String sheetName,int rowIndex , int cellIndex) throws Exception
	{
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\TestData\\HrEmailed.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String stringCellValue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return stringCellValue;
	}
}
