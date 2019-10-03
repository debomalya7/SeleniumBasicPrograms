package testpackages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class CaptureScreenshot_ActiTIMEPage extends BaseClass{

	public static void main(String[] args) throws IOException{
		//Creating on object of Date Class
		Date d = new Date();
		//Printing the actual Date
		String date1 =d.toString();
		System.out.println(date1);
		//replacing the colon present in the timestamp format to "_" using replaceAll()
		//method of string class
		String date2 =date1.replaceAll(":", "_");
		System.out.println(date2);
		//Enter the URL
		driver.get("http://debomalya/login.do");
		//Typecasting the driver object to TakeScreenShot interface type
		TakesScreenshot ts = (TakesScreenshot)driver;
		//getting the source file using getScreenshotAs() method and storing in a file
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshots\\"+date2+"__actiTIMELoginPage.png");
		//FileUtils.copyFile(srcFile,destFile);
		Files.copy(srcFile, destFile);
		driver.close();
		
		
		
		

	}

}
