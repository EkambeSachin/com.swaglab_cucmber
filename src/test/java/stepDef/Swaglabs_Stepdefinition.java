package stepDef;






import org.openqa.selenium.WebDriver;

import driverManager.DriverManager;
import io.cucumber.java.en.*;
import pageObject.Login_Swaglab;

public class Swaglabs_Stepdefinition {

	
		// TODO Auto-generated constructor stub
	
	WebDriver driver = DriverManager.getDriver();
	Login_Swaglab lgnPage = new Login_Swaglab(driver);
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		driver = DriverManager.getDriver();
		lgnPage=new Login_Swaglab(driver);
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	   driver.get(URL);
	}
	
	@Then("User Should enters the username as {string} and password as {string}")
	public void user_should_enters_the_username_as_and_password_as(String uname, String pass) {
		lgnPage.enter_username(uname);
		lgnPage.enter_password(pass);
		
	}
	@Then("Clicks on Login Button")
	public void clicks_on_login_button() {
		lgnPage.click_on_login();
	}
	@Then("User expect product page and Title {string}")
	public void user_expect_product_page_and_title(String string) {
	}
	
}
