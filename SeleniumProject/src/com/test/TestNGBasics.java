package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	@BeforeMethod
	@BeforeSuite
	public void setUp() {
		System.out.println("set up system property from chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launging Chrome Browser");
	}
	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test
	public void googleurltitile() {
		System.out.println("Google URL Title ");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void clearcookies() {
		System.out.println("Clear all cookies");
	}
	
	
	
}
