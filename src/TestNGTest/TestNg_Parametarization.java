package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNg_Parametarization {
 
  @BeforeClass
  @Parameters({"Browser","Platform"})
  public void setup(String Browser, String Platform) {
	  System.out.println("TestNg_parameters -> setup");
	  System.out.println("1. Parameter value from xml file: "+ Browser);
	  System.out.println("2. Parameter value from xml file: "+Platform );
	  
  }

  @Test
  @Parameters({"response"})
  public void Test(String response) {
	  String[] array = response.split(",");
	  System.out.println("TestNg_parameters -> Test");
	  System.out.println("Response from from xml file: "+ response );
	  System.out.println("Response from [0] xml file: "+ array[0] );
	  System.out.println("Response from [1] xml file: "+ array[1] );
  }
}
