package TestNGTest;

import org.testng.annotations.Test;

import ITestResultListners.customListners1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(customListners1.class)
public class TestNg_ITestResultListners1 {
  
  @BeforeClass
  public void beforeSetUp() {
	  System.out.println("This is a Before Class");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("This is a test method 1");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("This is a test method 2");
	  Assert.assertTrue(true);
  }

  @AfterClass
  public void AfterSetUp() {
  System.out.println("This is a After Class");
	  }

}
