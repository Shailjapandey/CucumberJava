package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.ButtonHelper;
import HelperPackages.ScreenShotHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CompositeActionsStepDfn {
	
	private WebDriver driver;
	private CustomChromeDriver customChromeDriver;
	private Actions actions;
	private Action action;
	private ButtonHelper buttonHelper;
	private ScreenShotHelper screenShotHelper;
	
	
	 
	@Given("^Action_I navigate to the webpage \"([^\"]*)\"$")
	public void Action_I_navigate_to_the_webpage(String webpage) {
		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.LaunchChromeDriver(driver);
		driver.get(webpage);
		buttonHelper = ButtonHelper.getInstance(driver);
		System.out.println("Start Browser");
	
	}

	@When("^Action_I create composite action for context click$")
	public void Action_I_create_composite_action_for_context_click() {
		actions = new Actions(driver);
		actions = actions.contextClick(driver.findElement(By.xpath("//span[text()='Draggable 1']")));
	}
	
	@When("^Action_I create composite action for drang and drop$")
	public void Action_I_create_composite_action_for_drang_and_drop() {
		WebElement source = driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		WebElement target = driver.findElement(By.id("mydropzone"));
		actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	@Then("^Action_I build the action$")
	public void Action_I_build_the_action() {
		action = actions.build();
	   
	}

	@Then("^Action_I perform the action$")
	public void Action_I_perform_the_action() {
		
		action.perform();
	}
	
	
	@Then("^Action_I close the browser$")
	public void Action_I_close_the_browser() throws InterruptedException, IOException {
		screenShotHelper = ScreenShotHelper.getInstance(driver);
	    screenShotHelper.takeScreenShot("Test", "ScreenShot");
		
		Thread.sleep(3000);
		driver.quit();
	    
	}



}
