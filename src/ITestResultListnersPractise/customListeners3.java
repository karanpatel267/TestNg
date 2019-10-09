package ITestResultListnersPractise;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class customListeners3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// Run before <suite> tag of the xml file
		System.out.println("before the suite tag, suite name of the xml file: "+ suite.getName() );
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// Run after <suite> tag of the xml file
		System.out.println("after the suite tag, suite name of the xml file: "+ suite.getName() );
	}

}
