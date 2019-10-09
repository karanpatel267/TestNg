package PractiseForTestNg;

import org.testng.annotations.DataProvider;

public class DataForDataProvider {
	@DataProvider(name="inputs")
	public Object[][] getdata(){
		return new Object[][]{
				{"BMW","X1"},
				{"Benz","C350"},
				{"Audi","Q7"},
	};
	}
}
