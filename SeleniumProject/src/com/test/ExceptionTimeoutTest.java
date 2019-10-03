package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
//	@Test(timeOut=2000)
//	public void InfiniteLoopTest() {
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void NumberFormatExceptionTest() {
		String x ="100A";
		Integer.parseInt(x);
	}

}
