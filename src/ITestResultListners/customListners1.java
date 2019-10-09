package ITestResultListners;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class customListners1 implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// This method will run before every single method
		
		System.out.println("Before Invoke Listner: "+ testResult.getTestClass().getName()
				+ " ,"+ " Method name is: "+ method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// This method will run after every single method
		
		System.out.println("After Invoke Listner: "+ testResult.getTestClass().getName()
				+ " ,"+ " Method name is: "+ method.getTestMethod().getMethodName());
		
	}

}
