package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
		Actions action=new Actions(driver);
		
		WebElement DragMe=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement DropHere=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(DragMe, DropHere).build().perform();
	}

}
