package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNg_ReportsAndLogs {
  
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("This is a before class", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("This is a before method", true);
	}

	@Test
	public void testMethod1() {
		Reporter.log("This is a test method 1", true);
	}

	@Test
	public void testMethod2() {
		Reporter.log("This is a test method 2", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { ("testMethod2") })
	public void testMethod3() {
		Reporter.log("This is a test method 3", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("This is a after method", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("This is a after class", true);
	}

}
