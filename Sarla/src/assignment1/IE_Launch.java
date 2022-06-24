  package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\browsers\\IE\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("IEDriverServer");
	}

}
