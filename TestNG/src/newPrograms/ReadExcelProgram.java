package newPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelProgram {

	public static void main(String[] args) throws Exception {
		File excelFile = new File("C:\\Users\\Anant\\eclipse-workspace\\TestNG\\demo.xlsx");
		System.out.println(excelFile.exists());			//file exists at given location
		FileInputStream fis= new FileInputStream(excelFile);     
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("TestData");
		int NoOfRows=sheet.getPhysicalNumberOfRows();
		
		int NoOfColumns = sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<NoOfRows;i++)
		{
			for(int j=0; j<NoOfColumns;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();
	}

}
