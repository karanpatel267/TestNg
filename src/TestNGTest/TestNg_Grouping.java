package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNg_Grouping {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a afterclass");
  }
  
  @Test(groups= {"Sedan","Audi"})
  public void AudiA6() {
	  System.out.println("This is audi A6 test");
  }
  
  @Test(groups= {"SUV","Audi"})
  public void AudiQ7() {
	  System.out.println("This is audi Q7 test");
  }
  @Test(groups= {"Sedan","BMW"})
  public void BMW328i() {
	  System.out.println("This is BMW 328i test");
  }
  
  @Test(groups= {"SUV","BMW"})
  public void BMWX6() {
	  System.out.println("This is BMW X6 test");
  }
}
