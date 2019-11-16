Feature: Working with mouse and keyword action

Background: Common step for the Scenario
	Given Action_I navigate to the webpage "https://www.seleniumeasy.com/test/drag-and-drop-demo.html"

Scenario: Working with context click
    When Action_I create composite action for context click
    Then Action_I build the action
    And Action_I perform the action
    Then Action_I close the browser
    
