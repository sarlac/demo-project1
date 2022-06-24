package screenshot_;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenshotHandle {

	public static void main(String[] args) throws IOException {
		
		//system class by suing the setproperty keys and value
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		
		//webdriver is your interface driver id reference varriable chromedriver is your class
		WebDriver driver=new ChromeDriver(); //webdrive is your interface
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//we are launching the URL
		driver.get("https://www.facebook.com/");	
		
		
		//full page screenshot
		//convert webdriver object as TakeScreenShot interface we typecasted and assigned to reference variable ts
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// call getScreenshot method to take image
		File srcfile1=ts.getScreenshotAs(OutputType.FILE);
		//copy image file to the destination
		//fileutils is an class and copy file is a method.
		FileUtils.copyFile(srcfile1,new File("C:\\Users\\Anant\\eclipse-workspace\\Sarla\\screenshots\\fullPage1.jpeg")); 
		
		/*
		//screenshot of a perticular section
		WebElement section=driver.findElement(By.xpath("//form[@class='_9vtf']"));
		File srcfile2=section.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile2,new File("C:\\Users\\Anant\\eclipse-workspace\\Sarla\\Screenshot\\webelement.jpeg")); */
		
		/*
		 * //screenshot of a element WebElement
		 * element=driver.findElement(By.xpath("//button[@name='login']")); File
		 * srcfile3=element.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcfile3, new
		 * File("C:\\Users\\Anant\\eclipse-workspace\\Sarla\\Screenshot\\element1.jpeg")
		 * );
		 */
	}

}
