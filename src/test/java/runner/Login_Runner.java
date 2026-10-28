package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= {"D:\\Eclipse\\com.SwagLab_Cucumber\\src\\test\\resources\\Feature\\swaglabs.feature"},
			glue="stepDef",
			plugin= {"pretty", "html:target/cucumber-reports/swalabs.html", "json:target/cucumber-reports/swaglabs.json"},
			monochrome=true,
			dryRun=false
			)
	public class Login_Runner extends AbstractTestNGCucumberTests{
		
}
