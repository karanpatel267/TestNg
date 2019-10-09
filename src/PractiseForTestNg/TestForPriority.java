package PractiseForTestNg;

import org.testng.annotations.Test;

public class TestForPriority {
	// priority is good method for which u want to run some method before any other method
	// but after some method so u can give priority to those methods
	// priority will only work when u r giving priority to all of the methods
	// otherwise it will just run alphabetically.
	
	
	@Test(priority = 2)
	  public void Test1()  {
		  System.out.println("This is a example in test 1");
		  
	  }
	  
	  @Test(priority = 1)
	  public void Test2() {
		  System.out.println("This is a example in test 2");
	  }
	  
	  @Test(priority = 0)
	  public void Test3() {
		  System.out.println("This is a example in test 3");
	  }
}
