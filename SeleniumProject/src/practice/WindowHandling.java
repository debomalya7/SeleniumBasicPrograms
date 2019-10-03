package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String mainWindow=driver.getWindowHandle();
		//to handle all new opened window
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		 while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("abc@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(mainWindow);			

	}

}
