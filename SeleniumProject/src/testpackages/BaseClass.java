package testpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\eclipse-workspace\\SeleniumProject\\driver1\\chromedriver.exe");
		//System.setProperty("webdriver.IEDriverServer.driver", ".\\Driver\\chromedriver.exe");
	}
	//public static WebDriver driver = new FirefoxDriver();
	public static WebDriver driver = new ChromeDriver();

}
