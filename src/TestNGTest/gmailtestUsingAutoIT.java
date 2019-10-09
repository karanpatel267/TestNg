package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class gmailtestUsingAutoIT {
	WebDriver driver;
	String url = "https://mail.google.com/mail/u/0/?ogbl#inbox";

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws AWTException, InterruptedException, IOException {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("hulk199995@gmail.com");

		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();

		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		pass.sendKeys("Manisha1995");
		
		WebElement next1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
		next1.click();

		WebElement compose = driver.findElement(By.xpath("//div[text()='Compose']"));
		compose.click();

		WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
		to.sendKeys("karandpatel@yahoo.com");

		WebElement subject = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subject.sendKeys("Robot");

		WebElement file = driver.findElement(By.xpath("//div[@command='Files']"));
		file.click();

		Runtime.getRuntime().exec("C:\\Users\\karan\\eclipse-workspace-selenium\\autoit\\fileupload.exe");

		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
