package newPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgram {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	 
	  SoftAssert softassert =new SoftAssert();
	  String expectedTitle ="Facebook – log in or sign up";
	  String actualtitle= driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedTitle);
	  System.out.println("test pass");
     
      softassert.assertAll();		// if your assert stmt failss it keeps eXecuting

  }
}
