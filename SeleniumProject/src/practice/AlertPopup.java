package practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class AlertPopup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contentEquals("Delete Customer")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("cusid")).sendKeys("abc");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Alert alert2 =driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		TakesScreenshot tScreenshot =(TakesScreenshot)driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File sourFile = tScreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("E:\\Projects\\eclipse-workspace\\SeleniumProject\\Screenshots\\page.png");
		Files.copy(sourFile, destinationFile);
		driver.quit();

	}

}
