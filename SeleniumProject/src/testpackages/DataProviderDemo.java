package testpackages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	// Create Data
	@DataProvider
	public Object[][] loginDetails() {
		Object[][] data = new Object[2][2];
		data[0][0] ="admin1";
		data[0][1] ="Manager1";
		data[1][0] ="admin2";
		data[1][1] ="Manager2";
		return data;
		
	}
	//Use the data
	@Test(dataProvider = "loginDetails")
	void testLogin(String un,String pwd) {
		System.out.println(un+" : "+pwd);
	}
	

}
