package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/buttons");
		
		//call action class
		Actions action=new Actions(driver);
		
		
		WebElement Doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(Doubleclick).build().perform();
		
		WebElement Rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(Rightclick).build().perform();
		
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(click).build().perform();
		
		driver.close();
	}

}
