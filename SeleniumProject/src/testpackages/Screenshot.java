package testpackages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Screenshot extends BaseClass{

	public static void main(String[] args) throws Exception {
		driver.get("https://www.amazon.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\debma\\Documents\\Amazon.png");
		Files.copy(srcFile, destFile);
		driver.close();
		
		
		
	}

}
