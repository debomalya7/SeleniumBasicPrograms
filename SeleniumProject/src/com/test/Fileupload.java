package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
	
	WebDriver driver;
	
	@Test
	public void testUpload() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/debma/Desktop/fileupload.html");
		driver.findElement(By.id("1")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\debma\\Desktop\\AutoIT\\Fileupload.exe");
		
		driver.quit();
		
		
	}

}
