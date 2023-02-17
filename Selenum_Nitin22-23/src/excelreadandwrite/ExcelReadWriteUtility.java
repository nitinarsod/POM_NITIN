package excelreadandwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {
	
	public void excelwrite(int sheetNo, int rowVal, int cellVal, String data) throws IOException {
		
		//load excel file
		FileInputStream	load = new FileInputStream("C:\\DO NOT DELETE\\ni3\\practice.xlsx");
		
		//access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		
		//perfom output action on output stream
		FileOutputStream writeoutput = new FileOutputStream("C:\\DO NOT DELETE\\ni3\\practice.xlsx");
		sheet1.createRow(rowVal).createCell(cellVal).setCellValue(data);
		workbook.write(writeoutput);
	}
		
		public void excelread(int sheetNo, int rowVal, int cellVal) throws IOException {
			
		//load excel file
		FileInputStream	load = new FileInputStream("C:\\DO NOT DELETE\\ni3\\practice.xlsx");
			
		//access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
			
		//get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		
		//read cell
		String data = sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue();
		System.out.println(data);
		
	}

}
