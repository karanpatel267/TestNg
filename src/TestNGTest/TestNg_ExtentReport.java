package TestNGTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.GenericMethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestNg_ExtentReport {
 
	WebDriver driver ;
	String baseURL = "https://www.letskodeit.com/";
	GenericMethods gm = new GenericMethods(driver);
	ExtentReports report;
	ExtentTest test;
	
  @BeforeMethod
  public void beforeMethod() {
	  report = new ExtentReports("C://Users//karan//Desktop//java programs//report.html");
	  test = report.startTest("Verify Welcome Text");
	  driver =  new ChromeDriver();
	  test.log(LogStatus.INFO,"Browser has opened");
	  
	 
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Maximize the browser");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get(baseURL);
	  test.log(LogStatus.INFO, "Web Application started");
	  
  }
  @Test
  public void login() throws InterruptedException {
	  WebElement signup = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
	  signup.click();
	  test.log(LogStatus.INFO, "Clicked on signup link");
	  //Thread.sleep(4000);
	  
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"signUpDialogswitchDialogLink\"]"));
	  login.click();
	  test.log(LogStatus.INFO, "Clicked on login link");
	  
	  Thread.sleep(3000);
	  WebElement email =  driver.findElement(By.id("memberLoginDialogemailInputinput"));
	  email.sendKeys("test@email.com");
	  test.log(LogStatus.INFO, "Entered the email address");
	  
	  Thread.sleep(3000);
	  
	  WebElement pass = driver.findElement(By.xpath("//*[@id=\"memberLoginDialogpasswordInputinput\"]"));
	  pass.sendKeys("abcabc");
	  test.log(LogStatus.INFO, "Entered the password");
	  Thread.sleep(2000);
	  
	  WebElement loginclick=  driver.findElement(By.id("memberLoginDialogokButton"));
	  loginclick.click();
	  test.log(LogStatus.INFO, "Clicked on login button");
	  Thread.sleep(2000);
	  
	  WebElement welcomText = null;
	  
	  try{
		  welcomText = driver.findElement(By.xpath("//*[@id=\"comp-iiqg1vggmemberTitle\"]"));
		  
	  }
	  catch(NoSuchElementException e) {
		  System.out.println(e.getMessage());
	  }
	  Assert.assertTrue(welcomText != null);
	  test.log(LogStatus.PASS, "Verified Welcome Text");
	  
  }

  @AfterMethod
  public void tearDown(ITestResult testresult ) throws IOException {
	
	  if(testresult.getStatus()== ITestResult.FAILURE) {
		   String path = gm.Screenshot(driver,testresult.getName());
		   String imgpath = test.addScreenCapture(path);
		   test.log(LogStatus.FAIL,"Verify Welcome Text Failed",imgpath);
	  }
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
