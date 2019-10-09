package TestNGTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import usefulMethods.takeScreenshot;

public class homePagePOM {
	WebDriver driver=null;
	ExtentReports reports;
	ExtentTest test;
	
	public homePagePOM(WebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test=test;
	}

	public void username(String email) {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(email);
		test.log(LogStatus.INFO, "Username has been provided");
		
	}
	
	public void password(String password) {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		test.log(LogStatus.INFO, "Password has been provided");
		
	}
	
	public void login() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		test.log(LogStatus.INFO, "Login button has been clicked");
		
	}
	
	public void assertname() {
		 WebElement name = driver.findElement(By.xpath("//div[text()='Karan Patel']"));
		
		 try {
			 
			   name = driver.findElement(By.xpath("//div[text()='Karan Patel']"));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		 
		 Assert.assertTrue(name ==null);
			test.log(LogStatus.PASS, "test has been passed");
	}
	
	public void testresult(ITestResult testresult) throws IOException {
	  if(testresult.getStatus()==ITestResult.FAILURE) {
		  String path =takeScreenshot.Screenshot(driver, testresult.getName());
		  String imgpath =test.addScreenCapture(path);
		  test.log(LogStatus.FAIL, "test has been failed",imgpath);
	  }
	 
}
}
