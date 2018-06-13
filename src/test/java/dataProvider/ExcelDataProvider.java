package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		  File src = new File ("./ApplicationTestData/AppData.xlsx");
		  
		  try {
			
			  FileInputStream fis= new FileInputStream(src);
			  
			                  wb = new XSSFWorkbook(fis);
			  
		} catch (Exception e) {
			
			System.out.println("exception is "+ e.getMessage());
			
			
		}
			
	}

	
	public String getData (int sheetIndex, int row, int column) 
	{
		
		
		String Data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return Data;
		
	
	}
	
	public String getData (String sheetname, int row, int column) 
	{
		
		
		String Data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
		return Data;
		
	
	}
	
	
	
}
