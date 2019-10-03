package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement rightClickButtonElement = driver.findElement(By.cssSelector(".context-menu-one"));
		actions.contextClick(rightClickButtonElement).build().perform();
		WebElement copyElement =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copytext =copyElement.getText();
		System.out.println(copytext);
		driver.quit();


	}

}
