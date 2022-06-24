package javascript;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor11 implements JavascriptExecutor,WebDriver,WebElement{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}

	@Override
	public Object executeAsyncScript(String arg0, Object... arg1) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object executeScript(String arg0, Object... arg1) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement findElement(By arg0) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
