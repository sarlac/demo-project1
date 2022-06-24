package readWriteExcel;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatAndWriteExcel {

	public static void main(String[] args) throws Exception {
	
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("sarla");
		sheet.getRow(1).createCell(1).setCellValue("Chimegawe");
		
		FileOutputStream file= new FileOutputStream("C:\\Users\\Anant\\eclipse-workspace\\Sarla\\src\\ExcelFiles\\Test.xlsx");
		
		workbook.write(file);
		workbook.close();
			
	}
}
