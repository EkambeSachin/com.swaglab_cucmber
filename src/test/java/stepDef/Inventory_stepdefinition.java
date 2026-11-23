package stepDef;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Inventory_Swaglab;

public class Inventory_stepdefinition {

	WebDriver driver = DriverManager.driver;
	Inventory_Swaglab inventory = new Inventory_Swaglab(driver);
	
	
	@Given("user is loged into the application with valid credentials")
	public void user_is_loged_into_the_application_with_valid_credentials() {
	   System.out.println("after login user is on product page");
	   
	   driver = DriverManager.getDriver();
		inventory = new Inventory_Swaglab(driver);
	}
	
	
	@Given("and user is redirected to product page")
	public void and_user_is_redirected_to_product_page() {
	    System.out.println("user is on product page");
	    String title = driver.getTitle();
	    System.out.println("page title is : "+title);
	    Assert.assertEquals(title, "Swag Labs", "page title is not matching");
	    System.out.println(inventory.page_Title());
	    
	    
	    System.out.println("Total product on the page: " +inventory.count_products());
	    System.out.println("List of the products on the page: "+inventory.products_inventory_list());
	}
	
	
	@When("the user click the product {string}")
	public void the_user_click_the_product(String string) {
	   System.out.println("user click on the product");
	   inventory.click_product();
	
	}
	
		@When("after viewing the details user should click on {string} button")
	public void after_viewing_the_details_user_should_click_on_button(String string) {
	   System.out.println("after viewing the details user click on the add to cart button");
	inventory.clickOn_add_to_cart();
	}
	
	
	@When("shopping count budge will be increased by {int}")
	public void shopping_count_budge_will_be_increased_by(Integer int1) {
	   System.out.println("shopping budge will be increased by 1 : "+int1);
	   inventory.shopping_budge_count();
	   
	}
	
	@When("user should click on cart icon")
	public void user_should_click_on_cart_icon() {
	   System.out.println("user click on the cart icon");
	   //inventory.Checkout_button();
	   inventory.click_on_cart_Icon();
	}
	
	@Then("user should be redirected to cart page")
	public void user_shopuld_be_redirected_to_cart_page() {
	  System.out.println("redirected to your cart page");
	   
	}

}
