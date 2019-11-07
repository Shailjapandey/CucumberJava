package Runner;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = ".//FeatureFile", //the path of the feature files
		glue= "StepDfn") 

public class RunTest { 
	
}