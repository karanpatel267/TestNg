package ITestResultListnersPractise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class customListeners2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//Runs on the start of the test method
		System.out.println(" On the test start: "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//Runs on the success of the test method
		System.out.println(" On the test success: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//Runs on the failure of the test method
		System.out.println(" On the test failure: "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// runs when the test is skipped or omitted 
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// This will run when success percent of the test is high or required amount
		// This is applicable where there are more than one test in the class and 
		// we want to show some message or provide some functionality when less than some 
		// percentage of the  test failed.
		
	}

	@Override
	public void onStart(ITestContext context) {
		// Runs on the start of the <test> tag of the xml file
		System.out.println(context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method:methods) {
			System.out.println(method.getMethodName());
			System.out.println("success percentange of the class is: "+method.getSuccessPercentage());
		}
 	}

	@Override
	public void onFinish(ITestContext context) {
		// Runs on the finish of the <test> tag of the xml file
		System.out.println(context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method:methods) {
			System.out.println(method.getMethodName());
			//System.out.println("success percentange of the class is: "+method.getSuccessPercentage());
		}
	}

}
