package PractiseForTestNg;

import org.testng.annotations.Test;

public class TestForDataProvider {
  @Test(dataProvider="inputs",dataProviderClass=DataForDataProvider.class)
  public void testMethod(String input1,String input2) {
	  System.out.println("input 1: "+input1);
	  System.out.println("input 2: "+input2);
  }
}
