package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUsingchrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\debma\\git\\SeleniumBasicPrograms\\SeleniumProject\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("mp3 download");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.partialLinkText("Free MP3 Downloads")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("url")).sendKeys("shape of you");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-lg btn-primary']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText().toString());
//		alert.dismiss();

		driver.findElement(By.xpath("//a[@href='/download?url=JGwWNGJdvx8']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String winhand : windowHandles) {
			
			if(!winhand.equals(parentWindow)) {
				driver.switchTo().window(winhand);
				
				System.out.println(driver.getTitle().toString());
			}
			
		}
		
		
		driver.quit();
		
		
	}
	

}
