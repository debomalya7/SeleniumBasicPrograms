package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectHandling {
	WebDriver driver;
	@Test
	public void multiSelect() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
		WebElement ele =driver.findElement(By.id("countriesSingle"));
		Select select = new Select(ele);
		
		List<WebElement> alloption = select.getOptions();
		System.out.println(alloption.size());
		for(WebElement w : alloption) {
			System.out.println(w.getText());
		}
		
		System.out.println("The drop down is Multiselect ? = "+select.isMultiple());
		
		select.selectByVisibleText("United states of America");
		select.selectByValue("india");
		
		WebElement ele2 = driver.findElement(By.id("countriesMultiple"));
		Select select2 = new Select(ele2);
		select2.selectByVisibleText("India");
		select2.selectByVisibleText("China");
		select2.selectByVisibleText("England");
		Thread.sleep(2000);
		select2.deselectByVisibleText("India");
		System.out.println(select2.getFirstSelectedOption().getText());
		List<WebElement> allselectedoptions =select2.getAllSelectedOptions();
		System.out.println("total selected element is : " + allselectedoptions.size());
		for (WebElement webElement : allselectedoptions) {
			System.out.println("the sekected elements are : "+ webElement.getText());
			}
		select2.deselectAll();
		
		//Select select2 = new  Select(element);
		
		
				
	}

}
