package ITestResultListnersPractise;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class customListeners1 implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Before every single method test method
		System.out.println("Before Invoked listners: "+ testResult.getTestClass().getName()
				+ ","+ " And method namee is: "+ method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// After every single method test method
		System.out.println("After Invoked listners: "+ testResult.getTestClass().getName()
				+ ","+ " And method namee is: "+ method.getTestMethod().getMethodName());
	}

}
