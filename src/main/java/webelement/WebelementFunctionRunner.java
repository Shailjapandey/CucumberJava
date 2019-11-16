package webelement;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = {"src/main/java/webelement/WebelementFunction.feature"}, //the path of the feature files
		glue= {"webelement"}) 

public class WebelementFunctionRunner extends AbstractTestNGCucumberTests{

}
