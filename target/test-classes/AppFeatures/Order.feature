Feature: Amazon Order Page
	In order to check my order details
	As  a registered user
	I want to specify the features of order details page
	
	Background:
		Given a registered user exists
		Given user is on Amazon login page
		When user enters username
		And user enters password
		And user click on login button
		Then user nevigates to order detail page

	Scenario: Check Previous Order Details
		Then user clicks on Orders link
		Then user checks the previous order details

	Scenario: Check Open Order Details
		Then user clicks on Buy Again link
		Then user check the open order details

	Scenario: Check Closed Order Details
		
		Then user clicks on Cancelled Orders link
		Then user check the closed order details