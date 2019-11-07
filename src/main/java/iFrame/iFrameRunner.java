package iFrame;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

	@RunWith(Cucumber.class) 
	@Cucumber.Options(
			features = ".//iFrame", //the path of the feature files
			glue= "iFrame",
			dryRun= false,
			monochrome = true) 

	public class iFrameRunner  {

	}

