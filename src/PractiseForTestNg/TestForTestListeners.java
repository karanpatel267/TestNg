package PractiseForTestNg;

import org.testng.annotations.Test;

import ITestResultListnersPractise.customListeners2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners(customListeners2.class)
public class TestForTestListeners {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class method");
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
  public void afterClass() {
	  System.out.println("This is after class method");
  }

}
