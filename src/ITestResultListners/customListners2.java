package ITestResultListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class customListners2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// This will run on the every single test run 
		System.out.println("On Test start: "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// This will run when test will pass
		System.out.println("On test success: "+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// This will run when test will fail
				System.out.println("On test failure: "+ result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// This will run when the test is skipped
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Not useful method i automation
		
	}

	@Override
	public void onStart(ITestContext context) {
		// This will run before the  <test> tag of xml file 
		System.out.println("On start: "+ context.getName());
		ITestNGMethod methods[]  = context.getAllTestMethods();
		for(ITestNGMethod method: methods) {
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// This will run after the  <test> tag of xml file 
				System.out.println("On finish: "+ context.getName());
				ITestNGMethod methods[]  = context.getAllTestMethods();
				for(ITestNGMethod method: methods) {
					System.out.println(method.getMethodName());
				}
		
	}

}
