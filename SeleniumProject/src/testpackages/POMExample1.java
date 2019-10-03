package testpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMExample1 {
	
	@FindBy(name="username")
	private WebElement unTb;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(id="loginButton")
	private WebElement btn;
	
	
	public POMExample1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		unTb.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		pwd.sendKeys(pw);
	}
	
	public void clicklogin() {
		btn.click();
	
	}

}
