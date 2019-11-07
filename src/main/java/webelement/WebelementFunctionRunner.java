package webelement;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = ".//webelement", //the path of the feature files
		glue= "webelement") 

public class WebelementFunctionRunner {

}
