package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class DriverManager {

	public static WebDriver driver;
	public  static  WebDriver getDriver() {
		
			if(driver==null) {
				String browser = ReadConfig.getBrowser();
				switch(browser) {
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
				default:
					throw new RuntimeException("browser is not found on specified path");
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			return driver;
		
		}
	
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
