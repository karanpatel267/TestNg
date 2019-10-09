package PractiseForTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNgClasses.ClassWithMethodForTestNG;

public class SoftAssertexample {
	ClassWithMethodForTestNG c1 = new ClassWithMethodForTestNG();
	
	// Soft Assert don't throw an exception when assert fails but records it.
	// When we call assertall() it will throw u exception for which the softassert failed.
	// It will tell u where assert failed but whole test will fail as a result.
	SoftAssert sa = new SoftAssert();
	
  @Test
  public void Test() {
	  System.out.println("This is a example for soft assert");
	  int actual = 3;
	  int expected = c1.AdditionOfInteger(1, 2);
	  System.out.println("Expected value of the addition is : "+expected);
	  sa.assertEquals(actual, expected);
	  int falsevalue = 2;
	  sa.assertEquals(falsevalue, expected);
	  sa.assertAll();
	 
	  
  }
}
