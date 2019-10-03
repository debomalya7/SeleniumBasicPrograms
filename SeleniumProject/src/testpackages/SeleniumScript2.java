package testpackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		 WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Debomalya Roy");
         
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_D); 
         r.keyPress(KeyEvent.VK_ENTER);
         
         r.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
        // element.submit();
         driver.close();



	}

}
