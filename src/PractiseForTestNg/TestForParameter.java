package PractiseForTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestForParameter {
  @Test
  @Parameters({"Browser","Platform"})
  public void SetUp(String Browser, String Platform) {
	  System.out.println("Testing parameter for Setup");
	  System.out.println("The value for Browser parameter: "+ Browser);
	  System.out.println("The value for Platform parameter: "+ Platform);
  }
  
  @Test
  @Parameters({"Numbers"})
  public void Split(String Numbers) {
	  String[] a1 = Numbers.split(",");
	  System.out.println("Testing parameter for Split");
	  System.out.println("The value for Numbers parameter: "+ Numbers);
	  System.out.println("The value for 1 Numbers parameter: "+ a1[0]);
	  System.out.println("The value for 2 Numbers parameter: "+ a1[1]);
	  System.out.println("The value for 3 Numbers parameter: "+ a1[2]);
  }
}
