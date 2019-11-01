package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\debma\\git\\SeleniumBasicPrograms\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String windowHandle = driver.getWindowHandle();
		System.out.println("Windrow handle id :" +windowHandle);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement searchbox = driver.findElement(By.name("q"));
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		
		searchbox.sendKeys("abcd");
		
		
		
		
		driver.quit();
	}

}
