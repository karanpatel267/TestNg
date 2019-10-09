package PractiseForTestNg;

import org.testng.annotations.Test;

public class TestForTimeOut {
  @Test(timeOut = 200)
  public void Test1() throws InterruptedException {
	  System.out.println("This is a example in test 1");
	  Thread.sleep(200);
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
