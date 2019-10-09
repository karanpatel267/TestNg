package TestNGTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.ExtentReport;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class test3 {
ExtentReport reports;
 ExtentTest test;
 ExtentReport er = new ExtentReport();
 
 
  @BeforeClass
  public void beforeClass() {
	  
	  //er.reports(reports, "hello");
	 // test = reports.startTest("verify the test has been started");
	  System.out.println("Before class method has been started");
	  
  }
  @Test
  public void f() {
	  System.out.println("Test method has been started");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class method has been started");
	  
  }

}
