package PractiseForTestNg;

import org.testng.annotations.Test;

public class TestForEnabled {
	 @Test
	  public void Test1() throws InterruptedException {
		  System.out.println("This is a example in test 1");
	  }
	  
	 // enabled is best option when u don't have to remove the test but don't want to 
	 // run that particular test
	  @Test(enabled = false)
	  public void Test2() {
		  System.out.println("This is a example in test 2");
	  }
	  
	  @Test
	  public void Test3() {
		  System.out.println("This is a example in test 3");
	  }
}
