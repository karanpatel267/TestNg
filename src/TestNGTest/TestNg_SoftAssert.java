package TestNGTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNgClasses.ClassWithMethodForTestNG;

public class TestNg_SoftAssert {
	ClassWithMethodForTestNG a1 = new ClassWithMethodForTestNG(); 
	SoftAssert sa = new SoftAssert();
	@Test
	public void TestMethod2() {
		  System.out.println("Running TestMethod2");
		  int Expectedresult = 3;
		  int result = a1.AdditionOfInteger(1,2);
		  System.out.println(result);
		  sa.assertEquals(result, 2);
		  System.out.println("Running first test case");
		  sa.assertEquals(result, Expectedresult);
		  System.out.println("Running Second test case");
		  sa.assertAll();
		  
}
}
