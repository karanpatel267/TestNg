package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class WindowBasedLoginPage {
	WebDriver driver;
	String url = "http://rsyspedia.india.rsystems.com/";

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
  public void test() throws IOException {
		
		Runtime.getRuntime().exec("C:\\Users\\karan\\eclipse-workspace-selenium\\autoit\\fileupload1.exe");
		
		
  }
 


}
