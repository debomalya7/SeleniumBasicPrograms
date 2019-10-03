package testpackages;

import org.openqa.selenium.By;

public class BrowseFilepopupHandle extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://html.com/input-type-file/");
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\debma\\Desktop\\New Text Document.txt");

	}

}
