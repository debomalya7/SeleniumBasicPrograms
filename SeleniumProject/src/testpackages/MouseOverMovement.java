package testpackages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMovement extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://book.spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Carry More Onboard")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();

	}

}
