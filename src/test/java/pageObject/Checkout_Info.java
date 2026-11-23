package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base_Class;

public class Checkout_Info extends Base_Class{

	public Checkout_Info(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath  = "//span[text()='Checkout: Your Information']")
	WebElement info_Title;
	
	@FindBy (xpath  = "//input[@placeholder='First Name']")
	WebElement fname;
	
	@FindBy (xpath  = "//input[@placeholder='Last Name']")
	WebElement lname;
	
	@FindBy (xpath  = "//input[@placeholder='Zip/Postal Code']")
	WebElement postal;
	
	@FindBy (xpath  = "//input[@type='submit']")
	WebElement continue_Button;
	
	
	
	public String checkout_info_page_title()
	{
	return info_Title.getText();	
	}
	
	public void enter_firstName(String firstname) {
		fname.sendKeys(firstname);
	}
	
	public void enter_lastName(String lastname) {
		lname.sendKeys(lastname);
	}
	
	public void enter_postalCode(String pin) {
		postal.sendKeys(pin);
	}
	
	public void click_on_continue_button() {
		continue_Button.click();
	}
}
