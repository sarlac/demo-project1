package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoarsEvent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/text-box");
		
		Actions action=new Actions(driver);
		
		WebElement Fullname=driver.findElement(By.id("userName"));
		Fullname.sendKeys("sarla");
		
		WebElement Email=driver.findElement(By.id("userEmail"));
		Email.sendKeys("xyz");
		
		WebElement Current=driver.findElement(By.id("currentAddress"));
		Current.sendKeys("Wagholi,pune");
		
		//keyboard Event
		//select the current address using ctrl+a
		action.keyDown(Keys.CONTROL);	//operation pressing ctrl key
		action.sendKeys("a");			//press key a
		action.keyUp(Keys.CONTROL);		//realeasing key ctrl
		action.build().perform();	//perform the action
		
		//copy the text using ctrl+c
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//pressing the tab key to move to next field to switch focus to the permanent address
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//paste text using ctrl+v
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		driver.close();
	}

}
