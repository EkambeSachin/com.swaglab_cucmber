package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base_Class;

public class Your_Cart extends Base_Class{

	public Your_Cart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Your Cart']")
	WebElement cart_title;
	
	@FindBy (xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement product_displayed;
	
	@FindBy (xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
	public String cart_page_title() {
		return cart_title.getText();
	}
	
	public String get_product_name() {
		return product_displayed.getText();
	}
	
	public void click_on_checkout() {
		checkout.click();
	}
}
