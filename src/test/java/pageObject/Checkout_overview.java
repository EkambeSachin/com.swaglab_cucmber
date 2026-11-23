package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base_Class;

public class Checkout_overview extends Base_Class{

	public Checkout_overview(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Checkout: Overview']")
	WebElement checkout_overview_title;
	
	@FindBy (xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement productname;
	
	@FindBy (xpath = "//div[@class='cart_quantity']")
	WebElement quantity;
	
	@FindBy (xpath = "//div[@class='inventory_item_desc']")
	WebElement description;
	
	@FindBy (xpath = "//div[@class='inventory_item_price']")
	WebElement price;
	
	@FindBy (xpath = "//div[@class='summary_total_label']")
	WebElement total;
	
	@FindBy (xpath = "//button[@name='finish']")
	WebElement finish;
	
	
	public String get_overview_title() {
		return checkout_overview_title.getText();
	}
	
	public String get_product_name() {
		return productname.getText();
	}
	
	public String get_Quantity() {
		return quantity.getText();
	}
	
	public String get_discription() {
		return description.getText();
	}
	
	public String get_price() {
		return price.getText();
	}
	
	public String get_total_Label() {
		return total.getText();
	}
	
	public void Click_On_Finish() {
		finish.click();
	}
}
