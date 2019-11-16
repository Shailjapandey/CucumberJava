package StepDfn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Annotation { 
   
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      System.out.println("Open Browser");
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      System.out.println("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() {
	   System.out.println("Click on login button");
   } 
}