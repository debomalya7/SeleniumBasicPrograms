package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
//		driver.navigate().back();
//		driver.close();
		driver.get("https://www.cipla.com/en/");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//ul[@class='nav menu']//li//a[text()='Corporate Information']"))).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//ul[@class='nav menu']//li//a[text()='Board Of Directors']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav menu']//li//a[text()=' Committees of Board']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='directorsList committee']//li//a[@class='inline'][text()='Mr. Ashok Sinha (Chairman)']")).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		////a[@title='Close']
		//edited
	}

}
