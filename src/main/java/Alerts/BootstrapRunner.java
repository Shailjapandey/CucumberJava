package Alerts;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = ".//Alerts/Bootstrap.feature", //the path of the feature files
		glue= "Alerts",
		dryRun= false,
		monochrome = true) 
public class BootstrapRunner {

}
