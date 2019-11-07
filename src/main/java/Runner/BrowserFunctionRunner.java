package Runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;


	
	@RunWith(Cucumber.class) 
	@Cucumber.Options(
			features = ".//FeatureFile/BrowserFunctionalFeature.feature", //the path of the feature files
			glue= "StepDfn",
			dryRun= false,
			monochrome = true) 

	public class BrowserFunctionRunner { 
		
	}


