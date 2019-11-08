Feature: Working with Java script popup 
Background: Common step for scenario 
	Given Aletrs_I navigate to the webpage "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html" 
	
	
	
Scenario: Java Script Confirm Box 
	When Aletrs_I click on click button 
	Then Aletrs_I When a confirm box pops up, user can click "OK" and check Ok press 
	Then Aletrs_I When a confirm box pops up, user can click "Cancel" and check Cancel press 
	And Aletrs_I close the browser 
	
Scenario: Handling Alerts 
	When Aletrs_I click on click button, it should show alter message 
	Then Aletrs_I switch to Alert popup and accept the alert 
	And Aletrs_I close the browser 

Scenario: Java Script Alert Box 
	Given Aletrs_I click on  for Promot Box button 
	When Aletrs_I Enter text and Click on OK 
	And  Aletrs_I Verify the Enter text 
	Then Aletrs_I close the browser
	
