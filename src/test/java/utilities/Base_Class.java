package utilities;



import java.time.Duration;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.Login_Swaglab;

public class Base_Class {

	public WebDriver driver;
	WebDriverWait wait;
	
	public  Base_Class(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
	}
	
}
