package newPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PriorityProgram {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void login() {
	  System.out.println("login completed");
  }
  
  @AfterMethod
  public void logout() {
	  System.out.println("logout completed");
  }
  @Test(priority=1)
  public void addStudent()
  {
	  System.out.println("Student data Added");
  }
  @Test()
  public void deleteStudent()
  {
	  System.out.println("Studenet data deleted");
  }
}
