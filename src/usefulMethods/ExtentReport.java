package usefulMethods;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	
	public static ExtentReports reports() {
		ExtentReports reports;
		String location;
		location = "C:\\Users\\karan\\Desktop\\java programs\\ExtentReports\\report-demo.html";
		reports = new ExtentReports(location,true);
		
		return reports;
	}

}
