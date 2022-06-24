package newPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelProgram1 
{
	public static void main(String[] args) throws IOException {
 

	  	
	  	//file input stream is used to read data from the given file
	  	FileInputStream file=new FileInputStream("C:\\Users\\Anant\\Downloads\\excelfiles\\demo11.xlsx");
	  	
	  	//used to form a structure(book of a cover
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		//used to read data from excel sheet
		XSSFSheet sheet= workbook.getSheet("Sheet1");

		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());

		
		  Row row1 =sheet.createRow(6); 
		  Cell cell1 = row1.createCell(6);
		  
		  cell1.setCellValue("TestNG creates reports automatically.");
		  
		  FileOutputStream fos=new
		  FileOutputStream("C:\\Users\\Anant\\Downloads\\demo.xlsx");
		  workbook.write(fos); 
		  workbook.close(); 
		  fos.close();
		  System.out.println("End of writing data in excel");
		  
  }
}
