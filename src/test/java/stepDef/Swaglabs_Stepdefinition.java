package stepDef;




import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login_Swaglab;
import utilities.Base_Class;
import utilities.ReadConfig;

public class Swaglabs_Stepdefinition extends Base_Class{

	WebDriver driver;
	@Before(order=0)
	public void setupMethod() throws IOException {
		Log=(Logger) LogManager.getLogger("Swaglabs_StepDefinition");
		readconfig=new ReadConfig();
		
		String browser=readconfig.getBrowser();
		Log.info("Setup Method executed...");
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			break;
		}
	}
	@Before(order=1)
	public void setupMethod1() {
		System.out.println("Before Method1");
		Log.info("setup Method1 executed...");
	}
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
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
	
@After
	public void tearDown(Scenario sc) throws IOException, WebDriverException  {
	System.out.println("tearDown Method executed....");
	Log.info("tearDown Method executed........");
	
	if(sc.isFailed()==true) {
		String path="com.SwagLab_Cucumber\\screenshots\\swaglabs.png";
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
	}
	if(driver!=null) {
	
	driver.close();
	}
	driver.quit();
	}
}
