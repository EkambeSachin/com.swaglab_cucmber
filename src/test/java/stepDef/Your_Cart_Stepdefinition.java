package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Checkout_Info;
import pageObject.Your_Cart;

public class Your_Cart_Stepdefinition {

	WebDriver driver = DriverManager.getDriver();
	Your_Cart cart = new Your_Cart(driver);
	
	@Given("user is loged into the application cart")
	public void user_is_loged_into_the_application_cart() {
		System.out.println("user is loged into the application cart");
		
		driver=DriverManager.getDriver();
		cart=new Your_Cart(driver);
	}
	
	@Given("the user is on your cart page")
	public void the_user_is_on_your_cart_page() {
		
	System.out.println("user is on your cart page");
	String actual = cart.cart_page_title();
	String expected = "Your Cart";
	Assert.assertEquals(actual,expected);
	
	}
	
	@Then("the product {string} should be displayed in the cart")
	public void the_product_should_be_displayed_in_the_cart(String string) {
	  String actual=cart.get_product_name();
		Assert.assertEquals(actual, "Sauce Labs Bolt T-Shirt");
	}
	
	@When("the user clicks on the checkout button")
	public void the_user_clicks_on_the_checkout_button() {
	    cart.click_on_checkout();
	}
	@Then("user should redirected to the checkout information page")
	public void user_should_redirected_to_the_checkout_information_page() {
	    System.out.println("redirected to checkout page");
	}
	
}
