package newPrograms;

import org.testng.annotations.Test;

public class dependsOn {
	@Test
	public void login() {
	  System.out.println("Login Completed");
	}
  
	//this will executes only after login method executes dependsonmethod gives priority execute the login method first
	@Test(dependsOnMethods="login")
	public void logout() {
	  System.out.println("Logout Completed");
  }
}
