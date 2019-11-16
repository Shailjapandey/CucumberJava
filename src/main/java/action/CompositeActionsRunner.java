package action;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/main/java/action/CompositeActions.feature"}, //the path of the feature files
		glue= {"action"},
		dryRun= false,
		monochrome = true) 


public class CompositeActionsRunner extends AbstractTestNGCucumberTests {

}
