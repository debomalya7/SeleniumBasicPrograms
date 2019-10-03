package testpackages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Mouse_Operation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		//launch the browser
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();
		//enter the URL
		driver.navigate().to("http://debomalya/login.do");
		driver1.navigate().to("http://debomalya/login.do");
		Thread.sleep(5000);
		//Create an object of Robot Class
		Robot r = new Robot();
		//move the mouse by x and y co ordinate
		r.mouseMove(300, 500);
		//press ALT key from keyboard
		r.keyPress(KeyEvent.VK_ALT);
		//press F key from keyboard
		r.keyPress(KeyEvent.VK_F);
		//Release F key from keyboard
		r.keyRelease(KeyEvent.VK_F);
		//Release ALT key from keyboard
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		//Press W key from keyboard to open a new private window
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.close();
		driver1.close();
		driver.quit();
		driver1.quit();

		
	}

}
