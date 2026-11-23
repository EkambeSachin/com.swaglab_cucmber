package stepDef;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Checkout_completed;

public class Checkout_Complete_stepdefinition {

	WebDriver driver= DriverManager.getDriver();
	Checkout_completed completed = new Checkout_completed(driver);
	
	@Given("the user is on checkout complete page")
	public void the_user_is_on_checkout_complete_page() {
	System.out.println(completed.checkout_completed_title());
	String actual = completed.checkout_completed_title();
	Assert.assertEquals(actual, "Checkout: Complete!");
	}
	
	
	@Then("the order confirmation header {string} should be displayed")
	public void the_order_confirmation_header_should_be_displayed(String string) {
	System.out.println(completed.get_confirmation_msg());
	String actual = completed.get_confirmation_msg();
	Assert.assertEquals(actual, "Thank you for your order!");
	}
	
	@Then("the user clicks on the back home button to return to the product page")
	public void the_user_clicks_on_the_back_home_button_to_return_to_the_product_page() {
	completed.click_on_back_home();
	System.out.println("back to home");
	}
	
}
