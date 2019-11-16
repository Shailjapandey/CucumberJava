package StepDfn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HelperPackages.BrowserHelperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class BrowserFunctionalFeature {

	private WebDriver driver;
	
	@Given("^I have chrome driver instance$")
	public void I_have_chrome_driver_instance() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pandes15\\Documents\\Selenium\\cucumbertest\\src\\main\\java\\BrowserDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	BrowserHelperClass.getInstance(driver).refresh();
	
	}

	@When("^I call the quite method to close browser$")
	public void I_call_the_quite_method_to_close_browser() {
	    driver.quit();
	}

	
}
