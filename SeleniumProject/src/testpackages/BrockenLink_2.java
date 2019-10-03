package testpackages;

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

public class BrockenLink_2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : "+links.size());
		ArrayList <WebElement> activeLink = new ArrayList<WebElement>();
		
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getAttribute("href")!=null) {
				activeLink.add(links.get(i));
			}
		}
		System.out.println("Total number of active links present : "+activeLink.size());
		
		for(int j=0;j<activeLink.size();j++) {
			HttpURLConnection con= (HttpURLConnection) new URL(activeLink.get(j).getAttribute("href")).openConnection(); 
			con.connect();
			String responseMessage = con.getResponseMessage();
			System.out.println(activeLink.get(j).getAttribute("href")+":"+responseMessage);
		}


	}
}
