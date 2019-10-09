package TestNGTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.ExtentReport;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class test2 {
 ExtentReports reports;
 ExtentTest test;
 
  @BeforeClass
  public void beforeClass() {
	  reports = ExtentReport.reports();
	  test = reports.startTest("Test has been started");
	  System.out.println("Before class method has been started");
	  test.log(LogStatus.INFO, "Before class method is starting");
  }
  @Test
  public void f() {
	  System.out.println("Test method has been started");
	  test.log(LogStatus.INFO, "Test method is starting");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class method has been started");
	  test.log(LogStatus.INFO, "After class method is starting");
	  reports.endTest(test);
	  reports.flush();
  }

}
