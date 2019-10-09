package PractiseForTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestNgClasses.ClassWithMethodForTestNG;

public class AssertsPractise {
	ClassWithMethodForTestNG c1 = new ClassWithMethodForTestNG();
  @Test
  public void AdditionOfInteger() {
	  System.out.println("This is a addition of integer example using assert");
	  int expected = 3;
	  int result = c1.AdditionOfInteger(1, 2);
	 Assert.assertEquals(result, expected);
  }
  @Test
  public void AdditionOfString() {
	  System.out.println("This is addition of string example using assert");
	  String expected = "Hello Luffy";
	  String actual = c1.AdditionOfStrings("Hello","Luffy");
	  Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void ArrayExample() {
	  System.out.println("This is array example using assert");
	  int[] actual = {10,20,30,40,50};
	  int[] expected = c1.GettingArray();
	  Assert.assertEquals(actual, expected);
  }
}
