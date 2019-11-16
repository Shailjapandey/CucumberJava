package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
			features = ".//FeatureFile/BrowserFunctionalFeature.feature", //the path of the feature files
			glue= "StepDfn",
			dryRun= false,
			monochrome = true) 

	public class BrowserFunctionRunner extends AbstractTestNGCucumberTests { 
		
	}


