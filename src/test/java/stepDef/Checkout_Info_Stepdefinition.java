package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Checkout_Info;
import pageObject.Your_Cart;

public class Checkout_Info_Stepdefinition {
	
	WebDriver driver = DriverManager.getDriver();
	Checkout_Info info = new Checkout_Info(driver);
	
	@Given("user is loged into the application")
	public void user_is_loged_into_the_application() {
		System.out.println("user is loged into the application");
		
		
	}
	
	@Given("the user is on the checkout information page")
	public void the_user_is_on_the_checkout_information_page() {
		
	String actual = info.checkout_info_page_title();
	Assert.assertEquals(actual, "Checkout: Your Information");
	}
	
	@When("the user enters first name {string} last name {string} and postal code {string}")
	public void the_user_enters_first_name_last_name_and_postal_code(String string, String string2, String string3) {
	info.enter_firstName("Sachin");
	info.enter_lastName("Ekambe");
	info.enter_postalCode("500028");
	}
	
	@When("the user clicks on the continue button")
	public void the_user_clicks_on_the_continue_button() {
	info.click_on_continue_button();
	}
	
	@Then("the user should be redirected to the checkout overview page")
	public void the_user_should_be_redirected_to_the_checkout_overview_page() {
	System.out.println("user is redicted to checkout overview page");
	
	}
	

}
