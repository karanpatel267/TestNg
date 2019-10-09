package TestNGTest;

import org.testng.annotations.Test;

public class TestNg_Dependencies {
	 @Test
	  public void TestMethod1() {
		  System.out.println("This is a test1");
	  }
	 
	 @Test(dependsOnMethods= {"TestMethod3"})
	  public void TestMethod2() {
		  System.out.println("This is a test2");
	  }
	 
	 @Test
	  public void TestMethod3() {
		  System.out.println("This is a test3");
	  }
}
