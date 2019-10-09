package usefulMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshot {

	public static String Screenshot(WebDriver driver,String Filename) throws IOException {
		Filename = Filename+".png";
		String Directory  ="C://Users//karan//Desktop//java programs//" ;
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(Directory+Filename));
		String destination = Directory + Filename;
		 return destination;
	
			}
}
