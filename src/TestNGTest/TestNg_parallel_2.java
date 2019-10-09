package TestNGTest;

import org.testng.annotations.Test;

public class TestNg_parallel_2 {
	@Test
	  public void Test1() throws InterruptedException {

		  System.out.println("TestNg_parallel 2 -> Test 1");
		  Thread.sleep(6000);
		  System.out.println("TestNg_parallel 2 -> Test 1 -> More steps");
	  }
	  
	  @Test
	  public void Test2() throws InterruptedException {

		  System.out.println("TestNg_parallel 2 -> Test 2");
		  Thread.sleep(6000);
		  System.out.println("TestNg_parallel 2 -> Test 2 -> More steps");
		  
	  }
}
