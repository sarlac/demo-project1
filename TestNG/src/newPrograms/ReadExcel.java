package newPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Anant\\Downloads\\excelfiles\\demo11.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());

		workbook.close();
	}

}
