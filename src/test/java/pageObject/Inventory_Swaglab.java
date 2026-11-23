package pageObject;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Base_Class;

public class Inventory_Swaglab extends Base_Class {

public Inventory_Swaglab(WebDriver driver){
		super(driver);  
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement click_cartIcon;
//	@FindBy(xpath="//span[text()='Your Cart']")
//	WebElement cart_pageTitle;
	
	@FindBy (xpath= "//div[@id='shopping_cart_container']//a//span[1]")
	WebElement Budge_count;
	
	@FindBy (xpath="//button[text()='Add to cart']")
	WebElement add_to_cart;
	
	@FindBy (xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement product;
	
	@FindBy (xpath="//select[@class='product_sort_container']//parent::span")
	WebElement filter;
	
	@FindBy (xpath="//div[@class='inventory_item_label']")
	List <WebElement> product_count;
	
	
	public String page_Title() {
		return driver.getTitle();
		
	}
	
	public int count_products() {
		//get the count of the procucts on the inventory page
		System.out.println("product count is: "+product_count.size());
		return product_count.size();
	}
	
	public String products_inventory_list() {
		//get the count of the procucts on the inventory page
		return product_count.toString();	
	}
	public  void filter_functionality() {
	 Select sel = new Select(filter);
	 sel.selectByValue("Price (high to low)");		
	}
	
	public void click_product() {
		product.click();
	}
	
	
	public void clickOn_add_to_cart() {
		add_to_cart.click();
	}
	
	public void shopping_budge_count() {
		String count = Budge_count.getText();
		System.out.println("Shopping budge count is "+count);
	}
	
//	public void Checkout_button() {
//		checkout.click();
//	}
		
	public void click_on_cart_Icon() {
		click_cartIcon.click();
	}
	
//	public String cart_page_title() {
//		
//		return cart_pageTitle.getText();	
//	}
}