package PractiseForTestNg;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class yahooTest {
 WebDriver driver;
 String url="https://login.yahoo.com/";
	
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
  }
  
  @Test
  public void f() throws AWTException, InterruptedException {
	  WebElement id = driver.findElement(By.id("login-username"));
	  id.sendKeys("karandpatel");
	  
	  Thread.sleep(3000);
	  
	 WebElement next = driver.findElement(By.name("signin"));
	 next.click();

	  Thread.sleep(3000);
	  
	  WebElement pass = driver.findElement(By.id("login-passwd"));
	  pass.sendKeys("Manisha1995");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("login-signin")).click();
	  
	  //driver.findElement(By.id("uh-mail-link")).click();
	  
	  WebElement compose = driver.findElement(By.xpath("//a[@role='button']"));
	  compose.click();
	  
	  WebElement to = driver.findElement(By.id("message-to-field"));
	  to.sendKeys("hulk199995@gmail.com");
	  
	  WebElement subject = driver.findElement(By.xpath("//input[@placeholder='Subject']"));
	  subject.sendKeys("Hello hulk");
	  
	  driver.findElement(By.xpath("//input[@title='Attach files']")).click();
	  
	  StringSelection ss = new StringSelection("C:\\Users\\karan\\Desktop\\New Text Document.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ss);
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  driver.findElement(By.xpath("//input[@title='Attach files']")).click();
	  
	  
	  
	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
