package excelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelRead {
	public static void main(String[]args) throws IOException{
		
		//get pathfor xcel
		File path= new File("C:\\DO NOT DELETE\\ni3\\practice.xlsx");
		
		//load excel file
		FileInputStream load = new FileInputStream(path);
		
		//workbook of exel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1= workbook.getSheetAt(0);
		
		//read cell
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
