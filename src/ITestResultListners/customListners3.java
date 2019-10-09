package ITestResultListners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class customListners3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// Before <suite> tag of xml file
		System.out.println("suite name on start : "+ suite.getName());
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// after <suite> tag of xml file
		System.out.println("suite name on finsh : "+ suite.getName());
	}

}
