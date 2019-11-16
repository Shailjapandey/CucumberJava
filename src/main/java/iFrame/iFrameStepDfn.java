package iFrame;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.ButtonHelper;
import HelperPackages.WindowHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import services.DriverService;

public class iFrameStepDfn {
	
	
	private WebDriver driver;
	private ButtonHelper buttonHelper;
	private WindowHelper windowHelper;
	private ArrayList<String> windowId;
	private CustomChromeDriver customChromeDriver;
 

	
	@Given("^MultipleWindow_I open the web page \"([^\"]*)\"$")
	public void MultipleWindow_I_open_the_web_page(String webpage) {
		
		
		
		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.LaunchChromeDriver(driver);
		driver.get(webpage);
		buttonHelper = ButtonHelper.getInstance(driver);
		WebDriverWait wait = getWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]")));
	  
	}

	@When("^MultipleWindow_I click on button and it will open the child browser window$")
	public void MultipleWindow_I_click_on_button_and_it_will_open_the_child_browser_window() throws InterruptedException {
		
		buttonHelper.click(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]"));
		//driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]")).click();
		Thread.sleep(3000);
		
		windowId = new ArrayList(driver.getWindowHandles());
		System.out.println(windowId);
		driver.switchTo().window(windowId.get(1));
		
	}

	@When("^MultipleWindow_I switch to child browser window and click on home button$")
	public void MultipleWindow_I_switch_to_child_browser_window_and_click_on_home_button() {
		WebDriverWait wait = getWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tryhome")));
		buttonHelper.click(By.id("tryhome"));
	    
	}

	@Then("^MultipleWindow_I click on the element present in parent window$")
	public void MultipleWindow_I_click_on_the_element_present_in_parent_window() {
		driver.switchTo().window(windowId.get(0));
		//windowHelper = driver.
		windowHelper.switchWindow(0);
	}

	@When("^MultipleWindow_I call the quite method the browser will close$")
	public void MultipleWindow_I_call_the_quite_method_the_browser_will_close() {
		driver.quit();
	}

	
	private WebDriverWait getWait(WebDriver driver,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait;
	}
	
}
