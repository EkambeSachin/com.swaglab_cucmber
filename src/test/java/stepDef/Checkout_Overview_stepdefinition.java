package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Checkout_overview;

public class Checkout_Overview_stepdefinition {
WebDriver driver = DriverManager.getDriver();
Checkout_overview overview = new Checkout_overview(driver);

	@Given("the user is on the checkout overview page")
	public void the_user_is_on_the_checkout_overview_page() {
	
	System.out.println(overview.get_overview_title());
	
	String actual = overview.get_overview_title();
	
	Assert.assertEquals(actual, "Checkout: Overview");
	}
	
	@Then("the order summery should display product name along with item, total and tax")
	public void the_order_summery_should_display_product_name_along_with_item_total_and_tax() {
	System.out.println(overview.get_product_name());
	String actual = overview.get_product_name();
	Assert.assertEquals(actual, "Sauce Labs Bolt T-Shirt");
	
	System.out.println(overview.get_Quantity());
	String actual1=overview.get_Quantity();
	Assert.assertEquals(actual1, "1");
	
	System.out.println(overview.get_discription());
	String actual2 = overview.get_discription();
	Assert.assertEquals(actual2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
	
	System.out.println(overview.get_price());
	
	System.out.println(overview.get_total_Label());
	
	}
	
	@When("user clicks on the finish button")
	public void user_clicks_on_the_finish_button() {
	overview.Click_On_Finish();
	}
	
	@Then("the user should be navigated to the checkout complete page")
	public void the_user_should_be_navigated_to_the_checkout_complete_page() {
	System.out.println("Navigated to checkout complete page");
	}
	
}
