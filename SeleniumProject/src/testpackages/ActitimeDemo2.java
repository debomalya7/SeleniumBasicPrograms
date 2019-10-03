package testpackages;

public class ActitimeDemo2 extends BaseClass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     	driver.get("http://debomalya/login.do");
//		WebElement unTb = driver.findElement(By.name("username"));
//		WebElement pwd =driver.findElement(By.name("pwd"));
//		WebElement loginbtn =driver.findElement(By.id("loginButton"));
//		unTb.sendKeys("admin 1");
//		pwd.sendKeys("manager 1");
//		loginbtn.click();
//		
//		unTb.sendKeys("admin 2");
//		pwd.sendKeys("manager 2");
//		loginbtn.click();
//		
		//invalid Credential
		POMExample1 login = new POMExample1(driver);
		login.setUsername("admin1");
		login.setPassword("manager1");
		login.clicklogin();
		
		driver.navigate().refresh();
		
		//valid Credential      
		login.setUsername("admin");
		login.setPassword("manager");
		login.clicklogin();
		

	}

}
