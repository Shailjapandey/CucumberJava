package Alerts;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = ".//Alerts", //the path of the feature files
		glue= "Alerts",
		dryRun= true,
		monochrome = true) 
public class AletrsRunner {

}
