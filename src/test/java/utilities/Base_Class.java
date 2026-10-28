package utilities;



import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import pageObject.Login_Swaglab;

public class Base_Class {

	WebDriver driver;
	
	public Login_Swaglab lgnPage;
	public static Logger Log;
	public ReadConfig readconfig;
}
