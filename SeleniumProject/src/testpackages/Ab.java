package testpackages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Ab extends BaseClass{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		driver.get("https:www.google.com");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/fb.png");
		Files.copy(src,destFile);
		driver.close();
		

	}

}
