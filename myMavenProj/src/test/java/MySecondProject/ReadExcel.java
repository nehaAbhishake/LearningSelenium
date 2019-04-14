package MySecondProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	FileInputStream input;
	HSSFWorkbook wb;
	HSSFSheet sheet;
	
	public  ReadExcel(String ExcelPath ) {
		System.out.println("ReadExcel");
		File source = new File(ExcelPath);
		try {
			 input = new FileInputStream(source);
		     wb = new HSSFWorkbook(input);
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void ReadExcelData(int SheetNumber,int RowNumber , int ColNumber) {
		sheet = wb.getSheetAt(SheetNumber);
		System.out.print(sheet.getRow(RowNumber).getCell(ColNumber).getStringCellValue());
	    //String str =  sheet.getRow(RowNumber).getCell(ColNumber).getStringCellValue();
	}
};
