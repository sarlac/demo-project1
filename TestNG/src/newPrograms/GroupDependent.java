package newPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDependent {
	
  WebDriver driver;	
	
	/*
	 * @Test(groups = {"regression"}) public void display() {
	 * 
	 * }
	 */
  
  @Test(groups = {"sanity"})
  
  public void starting_point() 
  {
	  System.out.println("Starting point of test");
	  System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  //depends on group we are using
  //test case of regression depends om sanity
  
	/*
	 * @Test(dependsOnGroups= {"sanity"},groups= {"regression"}) public void
	 * checktitle() { String testTitle="Facebook-log in or sign up"; String
	 * originalTitle=driver.getTitle();
	 * Assert.assertEquals(originalTitle,testTitle); }
	 */
  
  @Test(dependsOnGroups= {"sanity"},groups= {"regression"})
  public void login() throws InterruptedException
  {
	  Thread.sleep(2000);
	  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys("sachimegawe@gmail.com");
	  WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	  password.sendKeys("fshagfhvxsa");
	  WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	  login.click();
	   
  }
  @Test(dependsOnGroups= {"sanity"},groups= {"regression"})
  public void logout()
  {
	  driver.quit();
  }
}
