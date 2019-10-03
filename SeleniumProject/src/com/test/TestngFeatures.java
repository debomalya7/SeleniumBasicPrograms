package com.test;

import org.testng.annotations.Test;

public class TestngFeatures {
	
	@Test(enabled=false)
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="logintest")
	public void HomePageTest() {
		System.out.println("homepage test");
	}

}
