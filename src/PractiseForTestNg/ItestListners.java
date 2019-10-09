package PractiseForTestNg;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class ItestListners {
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
  
  @AfterMethod
  public void afterMethod(ITestResult testresult) {
	  if(testresult.getStatus()==ITestResult.SUCCESS)
	  {System.out.println(testresult.getName());
 }
	  if(testresult.getStatus()==ITestResult.FAILURE)
	  {System.out.println(testresult.getName());
 }
  }
}
