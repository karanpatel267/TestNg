package TestNGTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Priority {
	 @Test(priority =2)
	  public void TestMethod1() {
		  System.out.println("This is a test1");
	  }
	 
	 @Test(priority =1)
	  public void TestMethod2() {
		  System.out.println("This is a test2");
	  }
	 
	 @Test(priority =0)
	  public void TestMethod3() {
		  System.out.println("This is a test3");
	  }
	 
	
}
