package TestNGTest;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="inputs")
	public Object[][] getdata(){
		return new Object[][] {
			{"BMW","M3"},
			{"Benz","C350"},
			{"Audi","A6"},
		};
	}
}
