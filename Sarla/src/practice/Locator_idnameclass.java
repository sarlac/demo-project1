package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_idnameclass 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anant\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("sachimegawe@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d_Sh')]")).click();

	}

}
