Feature: Working with Java script popup

Scenario: Bootstrap Single Modal
	Given Bootstrap_I open the application "https://www.seleniumeasy.com/test/bootstrap-modal-demo.html"
	When Bootstrap_I Click on Launch Model
	Then Bootstrap_I It should open bootstrap popup
	And Bootstrap_I Click on close button
	Then Bootstrap_I close the browser	 