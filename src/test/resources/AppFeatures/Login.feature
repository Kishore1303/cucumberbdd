Feature: Login Feature

Scenario Outline: Login fail - possible combination
Given user is on Application landing page
When user clicks on Sign in button
Then  user dispplayed login page
When user enters "<UserName"> in username field
And user enters "<Password>" in password field
And user click on login in button
Then user get gets login failed error message

	Examples:
	| UserName 					 | Password 					|
	| Incorrect Username | 12324 							|
	| kishore 					 | incorrect password |
	| Incorrect Username | incorrect password |