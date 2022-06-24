package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
		//simple alert
		driver.findElement(By.xpath("//button[@id='alertButton']")).click(); 
		Alert SimpleAlert=driver.switchTo().alert();
		System.out.println(SimpleAlert.getText()); 
		Thread.sleep(2000);
		SimpleAlert.accept(); 
		   
		//confirmation alert
		driver.findElement(By.id("confirmButton")).click();
		Alert ConfirmAlert=driver.switchTo().alert();
		System.out.println(ConfirmAlert.getText());
		Thread.sleep(3000);
		ConfirmAlert.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText()); 
		
		//prompt alert
		driver.findElement(By.id("promtButton")).click();
		Alert PromptAlert=driver.switchTo().alert();
		System.out.println(PromptAlert.getText());
		Thread.sleep(3000);
		PromptAlert.sendKeys("sarla");
		PromptAlert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
