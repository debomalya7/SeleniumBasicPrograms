package testpackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle2 extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s1 = new Select(day);
		Select s2= new Select(month);
		Select s3= new Select(year);
		System.out.println(s1.isMultiple());
		
		List<WebElement> listdays = s1.getOptions();
		int totaldays = listdays.size()-1;
		System.out.println("Total number of days is :"+totaldays);
		
		System.out.println("**************************");
		
		List<WebElement> listmonth =s2.getOptions();
		for(int i=0 ; i<listmonth.size(); i++) {
			String monthval =listmonth.get(i).getText();
			System.out.println(monthval);
		}
		
		System.out.println("**************************");
		
        List<WebElement> listyear =s3.getOptions();
		for(int j=0 ; j<listyear.size(); j++) {
			String yearval =listyear.get(j).getText();
			System.out.println(yearval);
		}
		

	}

}
