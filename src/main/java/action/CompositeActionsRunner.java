package action;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = ".//action", //the path of the feature files
		glue= "action",
		dryRun= false,
		monochrome = true) 


public class CompositeActionsRunner {

}
