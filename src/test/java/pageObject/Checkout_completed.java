package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base_Class;

public class Checkout_completed extends Base_Class{

	public Checkout_completed(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Checkout: Complete!']")
	WebElement completed_title;
	
	@FindBy (xpath = "//h2[text()='Thank you for your order!']")
	WebElement confirmation_msg;
	
	@FindBy(xpath="//button[text()='Back Home']")
	WebElement backHome;
	
	public String checkout_completed_title() {
		return completed_title.getText();
	}
	
	public String get_confirmation_msg() {
		return confirmation_msg.getText();
	}
	
	public void click_on_back_home() {
		backHome.click();
	}
}
