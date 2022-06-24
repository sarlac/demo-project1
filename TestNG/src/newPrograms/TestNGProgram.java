package newPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGProgram {
	
  @Test
  public void first() {
	  System.out.println("first test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before methode execute before every method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After methode execute after every method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class execute before every class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class execute after every class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test execute before every test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test execute after every test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite execute first");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite execute last");
  }

}
