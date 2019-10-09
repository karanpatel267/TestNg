package TestNGTest;

import org.testng.annotations.Test;

public class TestNg_timeOut {
	 @Test
	  public void TestMethod1() {
		  System.out.println("This is a test1");
	  }
	 
	 @Test(timeOut = 200)
	  public void TestMethod2() throws InterruptedException {
		  System.out.println("This is a test2");
		  Thread.sleep(210);
	  }
	 
	 @Test
	  public void TestMethod3() {
		  System.out.println("This is a test3");
	  }
}
