import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertydemo {

	public static void main(String[] args) throws IOException {
		
		//created a class and its instance
		Properties Prop=new Properties();
		
		//FileInputStream obtain inputs input bytes from a file in a file system
		//What files are available depends on the host envirnoment
		FileInputStream file= new FileInputStream("C:\\Users\\Anant\\eclipse-workspace\\Sarla\\src\\configure.property");
		Prop.load(file);

		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //webdrive is your interface
		driver.manage().window().maximize();
		
		//implicit wait holds for every element here, global scope
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Explicit wait is waiting for that perticular element,local scope
		
		driver.get(Prop.getProperty("URL"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Prop.getProperty("username"));
		//System.out.println(Prop.get("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Prop.getProperty("pass"));
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath(Prop.getProperty("locator"))).click();  //not working
	}

}
