package PractiseForTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestForGrouping {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a afterClass");
  }
  
  @Test(groups= {"Sedan","audi"})
  public void audia8() {
	  System.out.println("This is a audi A8 Method");
  }
  
  @Test(groups= {"SUV","audi"})
  public void audiQ7() {
	  System.out.println("This is a audi Q7 Method");
  }
  @Test(groups= {"Sedan","bmw"})
  public void bmw328i() {
	  System.out.println("This is a bmw 328i Method");
  }
  @Test(groups= {"SUV","bmw"})
  public void bmwx6() {
	  System.out.println("This is a bmw X6 Method");
  }
}
