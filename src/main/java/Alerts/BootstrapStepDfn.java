package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.ButtonHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BootstrapStepDfn {
	
	
	private CustomChromeDriver customChromeDriver;
	private WebDriver driver;
	private ButtonHelper buttonHelper;
	
	
	
@Given("^Bootstrap_I open the application \"([^\"]*)\"$")
public void Bootstrap_I_open_the_application(String page) {
	customChromeDriver = new CustomChromeDriver();
	driver =  customChromeDriver.LaunchChromeDriver(driver);
	driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
	
	buttonHelper = ButtonHelper.getInstance(driver);
}

@When("^Bootstrap_I Click on Launch Model$")
public void Bootstrap_I_Click_on_Launch_Model() {
	
	buttonHelper.click(By.xpath("(//a[text()='Launch modal'])[1]"));
    
}

@Then("^Bootstrap_I It should open bootstrap popup$")
public void Bootstrap_I_It_should_open_bootstrap_popup() {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Close'])[1]")));
    
}

@Then("^Bootstrap_I Click on close button$")
public void Bootstrap_I_Click_on_close_button() {
	
	buttonHelper.click(By.xpath("(//a[text()='Close'])[1]"));
}

@Then("^Bootstrap_I close the browser$")
public void Bootstrap_I_close_the_browser() {
    driver.quit();
}

}
