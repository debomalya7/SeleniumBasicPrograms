package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinkTest {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total link present are " +allLinks.size());
		List<WebElement> ActiveLinks= new ArrayList<WebElement>();
		
		//Active Links
		for(int i=0;i<allLinks.size();i++) {
			if(allLinks.get(i).getAttribute("href") !=null || allLinks.get(i).getAttribute("img") != null){
				ActiveLinks.add(allLinks.get(i));				
			}						
		}
		
		//All Active links 
		System.out.println("Size of active links are : "+ActiveLinks.size());
		
		//check the href url with http connection 
		//200 -OK 404- Not Found 400 - Bad Request 500-Internal Error
		for(int j=0;j<ActiveLinks.size();j++) {
			HttpURLConnection connection =(HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String responseMessage = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(ActiveLinks.get(j).getAttribute("href")+"-------"+responseMessage);
			
		}
		
		
	}

}
