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

public class BrockenLinkandBrokenImage {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\debma\\git\\SeleniumBasicPrograms\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
	
		List<WebElement> activeElements = new ArrayList<WebElement>();
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getAttribute("href") !=null  &&(! links.get(i).getAttribute("href").contains("javascript"))) {
				activeElements.add(links.get(i));
			}
		}
		
		System.out.println("size of active links and images are :"+activeElements.size());
		
		for(int j=0;j<activeElements.size();j++) {
			
		HttpURLConnection connection =(HttpURLConnection)new URL(activeElements.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		String responseMessage = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeElements.get(j).getAttribute("href")+":::"+responseMessage);
		
		}

	}

}
