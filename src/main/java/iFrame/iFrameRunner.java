package iFrame;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	 
	@CucumberOptions (
			features = {"src/main/java/iFrame/iframe.feature"}, //the path of the feature files
			glue= {"iFrame"},
			dryRun= false,
			monochrome = true) 

	public class iFrameRunner extends AbstractTestNGCucumberTests  {

	}

