package stepDef;


import org.openqa.selenium.WebDriver;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import pageObject.Login_Swaglab;
import utilities.ReadConfig;

public class Hooks {
@BeforeAll	()
public static void setup() {
	DriverManager.getDriver();//driver initialization
}

//@Before(value = "@Login", order = 2)
//public void autoLogin() {
//	WebDriver driver = DriverManager.getDriver();
//	Login_Swaglab login =new Login_Swaglab(driver);
//	driver.get(ReadConfig.getUrl());
//	login.enter_username(ReadConfig.getUsername());
//	login.enter_password(ReadConfig.getPassword());
//	login.click_on_login();
//}
@AfterAll
public static void tearDown() {
	DriverManager.quitDriver();
}
	
}
