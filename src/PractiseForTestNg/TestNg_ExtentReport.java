package PractiseForTestNg;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.GenericMethods;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNg_ExtentReport {
  WebDriver driver;
  String baseURL = "https://www.letskodeit.com/";
  GenericMethods gm =new GenericMethods(driver);
  ExtentReports report;
  ExtentTest test;
  
  @BeforeClass
  public void beforeMethod() {
	 
	  report = new ExtentReports("C://Users//karan//Desktop//java programs//reportpractise.html");
	  test = report.startTest("Verify Welcome Text");
	  driver = new ChromeDriver();
	  test.log(LogStatus.INFO, "Browser started");
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser Maximized");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get(baseURL);
	  test.log(LogStatus.INFO, "Web application started");
  }
  
  @Test
  public void Test() throws InterruptedException {
	  WebElement loginsignup = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
	  loginsignup.click();
	  test.log(LogStatus.INFO,"click on login/signup link");
	  //Thread.sleep(2000);
	  
	  WebElement loginlink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
	  loginlink.click();
	  test.log(LogStatus.INFO,"click on login link");
	  Thread.sleep(4000);
	  
	  WebElement email = driver.findElement(By.id("memberLoginDialogemailInputinput"));
	  email.sendKeys("test@email.com");
	  test.log(LogStatus.INFO,"Enter email");
	  Thread.sleep(2000);
	  
	  WebElement pass = driver.findElement(By.id("memberLoginDialogpasswordInputinput"));
	  pass.sendKeys("abcabc");
	  test.log(LogStatus.INFO,"Enter password");
	  Thread.sleep(2000);
	  
	  WebElement loginbutton = driver.findElement(By.id("memberLoginDialogokButton"));
	  loginbutton.click();
	  test.log(LogStatus.INFO,"Click on Login button");
	  Thread.sleep(2000);
	  
	  WebElement WelcomeText = null;
	  
	  try{
		  WelcomeText = driver.findElement(By.xpath("//*[@id=\"comp-iiqg1vggmemberTitle\"]"));
		   }catch(Exception e){
			   System.out.println(e.getMessage());
			    }
	  Assert.assertTrue(WelcomeText == null);
	  test.log(LogStatus.INFO,"Welcome Text Verified");
  }

  @AfterMethod
  public void afterMethod(ITestResult TestResult) throws InterruptedException, IOException {
	 
	  if(TestResult.getStatus()==ITestResult.FAILURE) {
		  String path = gm.Screenshot(driver,TestResult.getName());
		  String imagepath = test.addScreenCapture(path);
		  test.log(LogStatus.FAIL,"Unable to verify the Welcome Text", imagepath );
	  }
	  Thread.sleep(2000);
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
