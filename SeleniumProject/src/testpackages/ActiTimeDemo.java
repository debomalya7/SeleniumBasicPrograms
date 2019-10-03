package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://debomalya/login.do");
		WebElement unTB = driver.findElement(By.className("username"));
		 org.openqa.selenium.Point p = unTB.getLocation();
		 int unXcor =p.getX();
		 System.out.println(unXcor);
		 driver.findElement(By.id("username")).getLocation().getY();
		 System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		Thread t = new Thread();
		t.sleep(2000);
		driver.quit();


	}

}
