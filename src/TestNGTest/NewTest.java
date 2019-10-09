package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Test1() {
	  System.out.println("This is a test1");
  }
  
  @Test
  public void Test2() {
	  System.out.println("This is a test2");
  }
  
  @Test
  public void Test3() {
	  System.out.println("This is a test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is a beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is a aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a aftersuite");
  }

}
