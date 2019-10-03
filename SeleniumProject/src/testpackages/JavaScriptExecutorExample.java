package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorExample extends  BaseClass{

	public static void main(String[] args) {

		driver.get("http://debomalya/login.do");
		//Enter password using JSE
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('username')[0].value='admin'");
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		//click on the login button
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		jse.executeScript("arguments[0].click()", loginButton);

	}

}
