package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathUsingAttribute_Actitime extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// Enter the URL of actiTime application
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("http://debomalya/login.do");

		//xpath using multiple attribute
		//String xp ="//input[@class='textField][@id='username']";
		//Thread.sleep(2000);
		//enter admin into user textbox
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		//find password element using xpath by attribute and enter manager into the password textbox
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		//find an image on the web page whose attributes(src) contais a value called timer
		WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		//store the width value
		String widthvalue = clock.getAttribute("width");
		System.out.println("the width is :"+ widthvalue);
		//System.out.println("The hight of the clock element is :"+clock.getAttribute("height"));
		//xpath using text function
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		//xpath using contais function
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contais(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
