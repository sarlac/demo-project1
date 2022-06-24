package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowColCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		
	    //No.of Columns
	    List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	    System.out.println("No of cols are : " +col.size()); 
	    
	    //No.of rows 
	    List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	    System.out.println("No of rows are : " + rows.size());
	    wd.close();

	}

}
