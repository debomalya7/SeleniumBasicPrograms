package testpackages;

import java.util.Set;

public class WindowsPopupHandle extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://www.naukri.com");
		String parentwh = driver.getWindowHandle();
		System.out.println("Windows Handle Id is : "+parentwh);
		Set<String> awh = driver.getWindowHandles();
		System.out.println("Total Open Windows : " + awh.size());
		
		for(String wh : awh) {
			driver.switchTo().window(wh);
			System.out.println("Window Handle Id"+wh + " Title : "+driver.getTitle());
			driver.close();
			}		
		
		for(String wh : awh) {
			driver.switchTo().window(wh);
			if(wh.equals(parentwh)) {
				driver.close();
			}
		}
		
		for(String wh : awh) {
			driver.switchTo().window(wh);
			System.out.println("Window Handle Id"+wh + " Title : "+driver.getTitle());
			if(driver.getTitle().equals("Amazon")){
				driver.close();
			}
			
		}

	}

}
