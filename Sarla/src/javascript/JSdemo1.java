package javascript;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSdemo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Alert pop window
		js.executeScript("alert('Happy Birthday!');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.navigate().to("https://www.facebook.com/");
		//click hidden element
		WebElement ForgotPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		js.executeScript("arguments[0].click();",ForgotPassword);
		
		js.executeScript("history.go(0)");
		
	}
}
