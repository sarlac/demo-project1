package webpage_locator;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		
		//driver.findElement(By.xpath(""))
	}

}
