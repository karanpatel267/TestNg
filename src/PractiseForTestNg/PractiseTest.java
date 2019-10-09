package PractiseForTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PractiseTest {
 WebDriver driver = new ChromeDriver();
	
 String baseURL = "https://letskodeit.teachable.com/";
  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  driver.get(baseURL);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
  @Test
  public void Test() {
	  driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
	  driver.findElement(By.id("user_email")).sendKeys("karan@yahoo.com");
	  driver.findElement(By.id("user_password")).sendKeys("HelloLuffy");
	  driver.findElement(By.name("commit")).click();
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.quit();
  }

}
