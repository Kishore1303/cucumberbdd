Feature:

Scenario: User registration with different data
	Given User is on registration page
	When User enters following user details
		| Kishore | M V | kmv@gmail.com | 9845378915 | Bangalore |
		| Uma	| bharadwaj | uma53@gmail.com | 9620136009 | Bangalore |
		| Jk | Gowda | jk@gmail.com	| 9884389798 | Mandya |
	Then User registration should be successful

	
	
	Scenario: User enters following user details with columns
	Given User is on registration page
	When User enters following user details with columns
		|	firstName | lastName | emailId | phone | location |
		| Kishore | M V | kmv@gmail.com | 9845378915 | Bangalore |
		| Uma	| bharadwaj | uma53@gmail.com | 9620136009 | Bangalore |
		| Jk | Gowda | jk@gmail.com	| 9884389798 | Mandya |
	Then User registration should be successful