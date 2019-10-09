package usefulMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	WebDriver driver;
	public GenericMethods(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement GetElement(String type,String locator) {
		
		type = type.toLowerCase();
		if(type.equals("id")) {
			System.out.println("Element found with locator is : "+locator);
			return this.driver.findElement(By.id(locator));		
		
		}else if(type.equals("name")) {
			System.out.println("Element found with locator is : "+locator);
			return this.driver.findElement(By.name(locator));	
		
	}else if(type.equals("class")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElement(By.className(locator));
		
	}else if(type.equals("linktext")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElement(By.linkText(locator));
		
	}else if(type.equals("partillinktext")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElement(By.partialLinkText(locator));
		
	}else if(type.equals("xpath")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElement(By.xpath(locator));
		
	}else if(type.equals("css")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElement(By.cssSelector(locator));
		
	}else {
		return null;
	}
}
	
	public List<WebElement> GetElementList(String type,String locator) {
	List<WebElement> elementlist = new ArrayList<WebElement>();
	
	type = type.toLowerCase();
	if(type.equals("id")) {
			System.out.println("Element found with locator is : "+locator);
			return this.driver.findElements(By.id(locator));		
		
	}else if(type.equals("name")) {
			System.out.println("Element found with locator is : "+locator);
			return this.driver.findElements(By.name(locator));	
		
	}else if(type.equals("class")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElements(By.className(locator));
		
	}else if(type.equals("linktext")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElements(By.linkText(locator));
		
	}else if(type.equals("partillinktext")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElements(By.partialLinkText(locator));
		
	}else if(type.equals("xpath")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElements(By.xpath(locator));
		
	}else if(type.equals("css")) {
		System.out.println("Element found with locator is : "+locator);
		return this.driver.findElements(By.cssSelector(locator));
		
	}else {
		System.out.println("Locator type is not supported");
	}
	if(elementlist.isEmpty()) {
		System.out.println("Element is not found with : "+type+"-"+ locator);
	}else {
		System.out.println("Element foud with: "+type+ "is "+locator);
	}
	return elementlist;
}

	public WebElement waitForElement(By locator,int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}
	
	public void readytoClick(By locator,int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public boolean isElementPresent(String type,String locator) {
		
		List<WebElement> elements = GetElementList(type,locator);
		
		int size = elements.size();
		if(size>0) {
			return true;
		}else {
		return false;
		}
		
	}
	
	public String Screenshot(WebDriver driver,String Filename) throws IOException {
		 Filename = Filename+".png";
		String Directory  ="C://Users//karan//Desktop//java programs//" ;

		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 FileUtils.copyFile(sourceFile, new File(Directory+Filename));
		 
		 String destination = Directory + Filename;
		 return destination;
	
			}
}