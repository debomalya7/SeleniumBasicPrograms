package testpackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ThrirdScript {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		//launch chrome
		WebDriver driver = new ChromeDriver();
		//maximize browser 
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.facebook.com/");
		//get the title of the page and print
		String title =driver.getTitle();
		System.out.println("Title of the page is :"+title);
		//get the url of the current page and print
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url entered is  :"+currentURL);
		//get the source code and print
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is :"+pageSource);
		//halt the execution for 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.get("https://www.amazon.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srsFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile =new File("./Screenshots.Amazon.png");
		Files.copy(srsFile, destFile);
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//opening youtube
		driver.get("https://www.youtube.com/");
		WebElement element = driver.findElement(By.name("search_query"));
		//searching entered input
		element.sendKeys("John Mayer");
		//using enter key without help of keyboard
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		
		driver.close();
		driver.quit();
		
		



	}

}
