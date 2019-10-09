package TestNGTest;

import org.testng.annotations.Test;

public class TestNg_enable {
	 @Test
	  public void TestMethod1() {
		  System.out.println("This is a test1");
	  }
	 
	 @Test(enabled = false)
	  public void TestMethod2() {
		  System.out.println("This is a test2");
	  }
	 
	 @Test
	  public void TestMethod3() {
		  System.out.println("This is a test3");
	  }
}
