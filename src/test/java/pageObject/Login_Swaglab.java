package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base_Class;

public class Login_Swaglab extends Base_Class{
	public WebDriver driver;
	public Login_Swaglab(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']" )
	WebElement submit;
	
	public void enter_username(String uname) {
		username.sendKeys(uname);
	}
	
	public void enter_password(String pass) {
		password.sendKeys(pass);
		
	}
	
	public void click_on_login()
	{
		submit.click();
	}
}
