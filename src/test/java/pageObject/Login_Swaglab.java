package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Swaglab  {

	WebDriver ldriver;
	
	public Login_Swaglab(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit1']" )
	WebElement submit;
	
	public void enter_username(String uname) {
		username.click();
	}
	
	public void enter_password(String pass) {
		password.click();
	}
	
	public void click_on_login()
	{
		submit.click();
	}
}
