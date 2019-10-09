package PractiseForTestNg;

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
  public void Test() {
	  System.out.println("This is a test1");
  }
  @Test
  public void Test2() {
	  System.out.println("This is a test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is a BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is a AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a AfterSuite");
  }

}
