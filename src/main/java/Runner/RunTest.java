package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 


@CucumberOptions(
		features = ".//FeatureFile", //the path of the feature files
		glue= "StepDfn") 

public class RunTest extends AbstractTestNGCucumberTests{ 
	
}