package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.AlertHelper;
import HelperPackages.ButtonHelper;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class AlertsStepDfn {

	private WebDriver driver;
	private CustomChromeDriver customChromeDriver;
	private ButtonHelper buttonHelper;
	private AlertHelper alertHelper;

	@Given("^Aletrs_I navigate to the webpage \"([^\"]*)\"$")
	public void Aletrs_I_navigate_to_the_webpage(String page) {

		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.LaunchChromeDriver(driver, page);
		buttonHelper = ButtonHelper.getInstance(driver);
		alertHelper = AlertHelper.getInstance(driver);
		
	}

	@When("^Aletrs_I click on click button, it should show alter message$")
	public void Aletrs_I_click_on_click_button_it_should_show_alter_message() {

		
		buttonHelper.click(By.cssSelector("[onclick='myAlertFunction\\(\\)']"));
	}

	@Then("^Aletrs_I switch to Alert popup and accept the alert$")
	public void Aletrs_I_switch_to_Alert_popup_and_accept_the_alert() throws InterruptedException {

		alertHelper.acceptAlert();
       
        
	}

	@When("^Aletrs_I click on click button$")
	public void Aletrs_I_click_on_click_button() throws InterruptedException {

		buttonHelper.click(By.xpath("//button[@class=\"btn btn-default btn-lg\" and text()=\"Click me!\"]"));
		
	}

	@Then("^Aletrs_I When a confirm box pops up, user can click \"([^\"]*)\" and check Ok press$")
	public void Aletrs_I_When_a_confirm_box_pops_up_user_can_click_and_check_Ok_press(String arg1) {
		alertHelper.acceptAlert();
		

	}

	@Then("^Aletrs_I When a confirm box pops up, user can click \"([^\"]*)\" and check Cancel press$")
	public void Aletrs_I_When_a_confirm_box_pops_up_user_can_click_and_check_Cancel_press(String arg1)
			throws InterruptedException {
		buttonHelper.click(By.xpath("//button[@class=\"btn btn-default btn-lg\" and text()=\"Click me!\"]"));
		alertHelper.dismissAlert();
     	String actualValue = driver.findElement(By.id("confirm-demo")).getText();
		System.out.println(actualValue);
	}

	@Given("^Aletrs_I click on  for Promot Box button$")
	public void Aletrs_I_click_on_for_Promot_Box_button() throws InterruptedException {
		buttonHelper.click(By.xpath("//button[@class='btn btn-default btn-lg' and text()='Click for Prompt Box']"));
		
	}

	@When("^Aletrs_I Enter text and Click on OK$")
	public void Aletrs_I_Enter_text_and_Click_on_OK() throws InterruptedException  {
		alertHelper.setAlertTest("Testing");
			
	}

	@When("^Aletrs_I Verify the Enter text$")
	public void Aletrs_I_Verify_the_Enter_text() {
		String actualValue = driver.findElement(By.id("prompt-demo")).getText();
		System.out.println(actualValue);
	}

	@Then("^Aletrs_I close the browser$")
	public void Aletrs_I_close_the_browser() {
		if(driver != null)
		{
	    driver.quit(); // it will close all the window and stop the web driver
	    	
	    }
	}

}
