package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	
	
	@Test(priority=2,groups="Search Module")
	public void googleurltitile() {
		System.out.println(driver.getTitle());
//		if(driver.getTitle().equals("Google")) {
//			System.out.println("test passed");
//		}
//		else {
//			System.out.println("Test failed");
//		}
		AssertJUnit.assertEquals(driver.getTitle(), "Google1", "Title not matched");
		
	}
	
	@Test(priority=1,groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		AssertJUnit.assertEquals(b, true);
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
