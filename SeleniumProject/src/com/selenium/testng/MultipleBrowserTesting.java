package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTesting {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void beforeClass(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\debma\\OneDrive\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\debma\\OneDrive\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
//		else if (browser.equalsIgnoreCase("internetExplorer")) {
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\debma\\OneDrive\\eclipse-workspace\\SeleniumProject\\driver\\IEDriverServer.exe");
//			WebDriver driver = new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\debma\\OneDrive\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
//			WebDriver driver = new ChromeDriver();
//		}
		else {
			System.out.println("no driver found");
		}
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void login() {
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
