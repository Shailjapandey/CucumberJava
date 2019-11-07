package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.TextBoxHepler;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class WebelementFunctionStepDfn {
	
	private WebDriver driver;
	private CustomChromeDriver customChromeDriver;
	private TextBoxHepler textBoxHepler;
	

	@Given("^WebElementFunction_I open the facebook home page \"([^\"]*)\"$")
	public void WebElementFunction_I_open_the_facebook_home_page(String URL) {
		customChromeDriver = new CustomChromeDriver();
		driver= customChromeDriver.LaunchChromeDriver(driver ,URL);
	    
	}

	@When("^WebElementFunction_I provide the unique location to findelement api$")
	public void WebElementFunction_I_provide_the_unique_location_to_findelement_api() {
		
		
		textBoxHepler = TextBoxHepler.getInstance(driver);
		
	}

	@Then("^WebElementFunction_I should get webelement$")
	public void WebElementFunction_I_should_get_webelement() {
		
		textBoxHepler.clear(By.id("email"));
		textBoxHepler.setText(By.id("email"), "shailja");
		String value = textBoxHepler.getText(By.id("email"));
		System.out.println(value);
	   
	}

	@When("^WebElementFunction_I call the quit method browser will close$")
	public void WebElementFunction_I_call_the_quit_method_browser_will_close() {
		if(driver!=null)
			driver.quit();
	    
	}


}
