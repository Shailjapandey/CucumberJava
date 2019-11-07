Feature: Web Element Function
Background: Common step for Web Element Function
	Given WebElementFunction_I open the facebook home page "https://www.facebook.com"

Scenario: Webelement Function for single element
	When WebElementFunction_I provide the unique location to findelement api
	Then WebElementFunction_I should get webelement
	When WebElementFunction_I call the quit method browser will close
