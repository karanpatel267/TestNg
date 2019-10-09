package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestNgClasses.ClassWithMethodForTestNG;

public class NewTest1 {
	
	ClassWithMethodForTestNG a1 = new ClassWithMethodForTestNG();
  @Test
  public void TestMethod1() {
	  System.out.println("Running TestMethod1");
	  String Expectedresult = "Hello Luffy";
	  String result = a1.AdditionOfStrings("Hello", "Luffy");
	  System.out.println(result);
	  Assert.assertEquals(result,Expectedresult );
			  
  }
  
  @Test
  public void TestMethod2() {
	  System.out.println("Running TestMethod2");
	  int Expectedresult = 3;
	  int result = a1.AdditionOfInteger(1,2);
	  System.out.println(result);
	  Assert.assertEquals(result,Expectedresult );
	  
  }
  
  @Test
  public void Testmethod3() {
	  System.out.println("Running TestMethod3");
	  int[] Expectedresult = {10,20,30,40,50};
	  int[] result = a1.GettingArray();
	  Assert.assertEquals(result,Expectedresult );
  }
  
}
