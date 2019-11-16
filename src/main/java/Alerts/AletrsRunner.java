package Alerts;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src\\main\\java\\Alerts\\Alerts.feature"}, //the path of the feature files
		glue= {"Alerts"},
		dryRun= false,
		monochrome = true) 
public class AletrsRunner  extends AbstractTestNGCucumberTests{

}
