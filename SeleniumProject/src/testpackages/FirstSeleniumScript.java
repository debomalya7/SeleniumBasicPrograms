package testpackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws Exception {
		// Set the path of driver executable
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		//launch the browser
		WebDriver driver = new ChromeDriver();
		//Enter URL
		driver.get("https://classic.crmpro.com/index.html");
		String header=driver.getTitle();
		System.out.println(header);
//		driver.get("https://www.facebook.com/");
//		String title = driver.getTitle();
//		System.out.println("Title of the current page is : "+title);
//		Thread.sleep(2000);
//		System.out.println("The current url of the website is : "+driver.getCurrentUrl());
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(2000);
//		//navigate to facebook
//		driver.navigate().back();
//		Thread.sleep(2000);
//		//navigate to next page
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		//capture google page screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		Thread.sleep(2000);
//		File srsFile = ts.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/google.png");
//		//File destFile1 =new File("./Screenshots/google1.png");
//		//
//		Files.copy(srsFile, destFile);
//		
//		driver.close();
		
		
		
	}

}
