package TestNGTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNg_ITestResultListner {
  @Test
  public void testMethod1() {
	  System.out.println("Running test method 1");
	  Assert.assertTrue(false, "This is failed test");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test method 2");
	  Assert.assertTrue(true, "This is passed test");
  }
  
  @AfterMethod
  public void afterMethod(ITestResult testresult) {
	  if(testresult.getStatus()== ITestResult.FAILURE){
	  System.out.println(testresult.getMethod().getMethodName());
	  }
	  if(testresult.getStatus()== ITestResult.SUCCESS){
		  System.out.println(testresult.getName());
		  }
  }

}
