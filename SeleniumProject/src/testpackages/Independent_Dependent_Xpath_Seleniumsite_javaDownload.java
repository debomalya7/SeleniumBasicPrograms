package testpackages;

import org.openqa.selenium.By;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
	// enter the url
  	 driver.get("http://www.seleniumhq.org/download/");
	 Thread.sleep(9000);
// xpath using independent and dependent concept
    driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
    driver.close();
 }


}
