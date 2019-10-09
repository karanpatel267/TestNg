package PractiseForTestNg;

import org.testng.annotations.Test;

public class TestForDependencies {
	
	// dependsOnMethods is the good option when u want run the particular method before running
	// another method 
	// For example test 1 would run before test 2 and 3 but if u have something in test 1 which
	// will only run if test 3 run before test 1. In this kind of cases dependsOnMethods is good
	// option
	 @Test(dependsOnMethods = {"Test3"})
	  public void Test1() throws InterruptedException {
		  System.out.println("This is a example in test 1");
		 
	  }
	  
	  @Test
	  public void Test2() {
		  System.out.println("This is a example in test 2");
	  }
	  
	  @Test
	  public void Test3() {
		  System.out.println("This is a example in test 3");
	  }
}
