package testpackages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Alert alertobj =driver.switchTo().alert();
		String alertmsg = alertobj.getText();
		System.out.println(alertmsg);
		if (alertmsg.equals("Are you sure you want to give us the deed to your house?")) {
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		alertobj.dismiss();
		Thread.sleep(3000);
		driver.close();

	}

}
