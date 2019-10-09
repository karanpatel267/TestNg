package TestNGTest;

import org.testng.annotations.Test;

public class TestNg_DataProvider {
 
	@Test(dataProvider="inputs",dataProviderClass=TestData.class)
  public void TestMethod1(String input1, String input2) {
	  System.out.println(" Input 1: "+input1);
	  System.out.println(" Input 2: "+input2);
  }
}
