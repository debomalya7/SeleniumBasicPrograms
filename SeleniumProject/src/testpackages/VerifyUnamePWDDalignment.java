package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUnamePWDDalignment extends BaseClass{

	public static void main(String[] args) {
		driver.get("http://debomalya/login.do");
		WebElement unTB = driver.findElement(By.name("username"));
		int un_x =unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height =unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("pwd"));
		int pw_x =pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if(un_x==pw_x && un_width==pw_width && un_height==pw_height) {
			System.out.println("username and password thextbox are aligned");
		}
		else
		{
			System.out.println("username and password thextbox are not aligned");
		}
		driver.quit();
	}

}
