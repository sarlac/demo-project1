package newPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsProgram {
	
	  public WebDriver driver;
	  //@Test(retryAnalyzer = RetryAnalyzer.class)   				//it executes again and again
	  
  public void fb() {
	  System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	  driver.get("https://www.facebook.com/");
		
	  String expectedTitle ="Facebook – log in or Sign up";    	//this what you expected
	  String actualtitle= driver.getTitle();					//what ur fecthing that is actual
	      
	  //Hard Assert or default assert it will not execute the stmt or the test case if your assertion fails
	  Assert.assertEquals(actualtitle, expectedTitle);
	  System.out.println("Test pass");
  }
  
  
  		@Test
  		public void teardown()
  		{
  			System.out.println("close the browser");
  			// driver.quit();
  		}
}
