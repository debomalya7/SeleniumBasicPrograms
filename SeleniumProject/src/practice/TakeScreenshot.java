package practice;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import testpackages.BaseClass;

public class TakeScreenshot extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		driver.get("https://www.youtube.com");
		TakesScreenshot tScreenshot =(TakesScreenshot)driver;
		File srcytb =tScreenshot.getScreenshotAs(OutputType.FILE);
		File destytb = new File("E:\\Projects\\eclipse-workspace\\SeleniumProject\\Screenshots\\ytb.png");
		Files.copy(srcytb, destytb);
		driver.close();
		

	}

}
