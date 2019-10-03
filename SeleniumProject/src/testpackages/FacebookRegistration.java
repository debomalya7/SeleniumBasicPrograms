package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration extends BaseClass{

	public static void main(String[] args) throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_j")).sendKeys("Raja");
		driver.findElement(By.id("u_0_l")).sendKeys("Ram Mohan Roy");
		driver.findElement(By.id("u_0_o")).sendKeys("rajarammohanroy@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rajarammohanroy@gmail.com");
		driver.findElement(By.id("u_0_v")).sendKeys("123456789");
		//driver.findElements(By.id("day")).
		Select s1 = new Select(driver.findElement(By.id("day")));
		s1.selectByVisibleText("1");
		Select s2 = new Select(driver.findElement(By.id("month")));
		s2.selectByVisibleText("Sept");
		Select s3 = new Select(driver.findElement(By.id("year")));
		s3.selectByValue("2002");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.id("u_0_11")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
