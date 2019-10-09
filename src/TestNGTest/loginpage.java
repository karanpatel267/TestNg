package TestNGTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.ExtentReport;
import usefulMethods.GenericMethods;
import usefulMethods.takeScreenshot;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class loginpage {
	WebDriver driver ;
	ExtentReports report;
	ExtentTest test;
	homePagePOM hp;

	@BeforeClass
  public void beforeClass() {
	  report = ExtentReport.reports();
	  test = report.startTest("Verify the test has started");
	  driver = new ChromeDriver();
	  hp =  new homePagePOM(driver, test);
	  test.log(LogStatus.INFO, "Browser has been opened");
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser has been maximized");
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }
  @Test
  public void test() throws InterruptedException {
	
	 hp.username("karandpatel@yahoo.com");
	 hp.password("Sakhi1975");
	 hp.login();
	 Thread.sleep(4000);
	 hp.assertname();
	
	 
  }
  @AfterMethod
  public void tearDown(ITestResult testresult) throws IOException, InterruptedException{
	hp.testresult(testresult);
	  
	  Thread.sleep(4000);
	  driver.close();
	  report.endTest(test);
	 // report.flush();
  }  
  
}
