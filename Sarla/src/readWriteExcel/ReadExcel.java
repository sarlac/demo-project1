package readWriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Anant\\Downloads\\demo.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("TestData");

		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());

		Row row1 =sheet.createRow(6);
		Cell cell1 = row1.createCell(6);

		cell1.setCellValue("hi guys lots of holiday we have taken  i regret for it");

		FileOutputStream fos=new FileOutputStream("C:\\Users\\Anant\\Downloads\\demo.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("End of writing data in excel");    

	}

}
