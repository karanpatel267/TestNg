package PractiseForTestNg;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class TestForSuiteListeners2 {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class method for test 2");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("This is a test method 1 for test 2");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("This is a test method 2 for test 2");
	  Assert.assertTrue(true);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class method for test 2");
  }

}
