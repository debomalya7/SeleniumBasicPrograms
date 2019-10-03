package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select s1 = new Select(day);
//		s1.selectByVisibleText("10");
//		Select s2 = new Select(month);
//		s2.selectByVisibleText("Mar");	
//		Select s3 = new Select(year);
//	    s3.selectByVisibleText("1990");
		
		selectValuefromDropdown(day, "7");
		selectValuefromDropdown(month, "Mar");
		selectValuefromDropdown(year, "1990");
	
	}	
		public static void selectValuefromDropdown(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		
		}

}
