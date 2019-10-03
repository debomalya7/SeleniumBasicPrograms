package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		WebElement sourceElement =driver.findElement(By.id("draggable"));
		WebElement destElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(destElement).release().build().perform();
		driver.close();
	
	}

}
