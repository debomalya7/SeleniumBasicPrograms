package testpackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class BrowserNavigationExample  extends BaseClass {

	public static void main(String[] args) throws InterruptedException, Exception {
		//driver.get("http://debomalya/login.do");
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("admin");
		//driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("hello");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}

}
