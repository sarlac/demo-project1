package javascript;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//implementing implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//get to that desired URL
		driver.get("https://demoqa.com/browser-windows");
		//open new tab
		WebElement Tabbutton=driver.findElement(By.xpath("//button[@id='tabButton']"));
		Tabbutton.click();
		//WebElement NewWindow=driver.findElement(By.xpath("//button[@id='windowButton']"));
		//WebElement NewMessage=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		
		//handles single window using getwindowhandle
		String MainWindow=driver.getWindowHandle();
		
		//handling multiple windows using set interface
		Set<String>ChildWindows=driver.getWindowHandles();
		
		//iterator is interface used to iterate the window
		Iterator<String>iterator=ChildWindows.iterator();
		
		//using while loop
		while(iterator.hasNext())
		{
			String ChildWindow=iterator.next();
			//it will ignore the capital and small scale letter
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				//switched from main window to child window
				driver.switchTo().window(ChildWindow);
			}
			
		}
		//will get the URL of child window
		System.out.println(driver.getCurrentUrl());
		//get text
		String SampleHeading=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(SampleHeading);
		Thread.sleep(3000);
		//we have again switched to main window
		driver.switchTo().window(MainWindow);
	}

}
