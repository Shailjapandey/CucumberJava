Feature: Working with Frame

Background: Working with MultipleWindow 
	Given MultipleWindow_I open the web page "https://www.w3schools.com/js/js_popup.asp"
	
Scenario: Click on the element presnet in Iframe
	When MultipleWindow_I click on button and it will open the child browser window
	And MultipleWindow_I switch to child browser window and click on home button
	Then MultipleWindow_I click on the element present in parent window
	When MultipleWindow_I call the quite method the browser will close
