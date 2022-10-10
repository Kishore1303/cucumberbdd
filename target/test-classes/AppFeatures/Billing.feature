Feature: Calculate Billing amount

Scenario Outline: Billing amount
	Given User is on billing page
	When user enters billing amount <billingamount>
	When user enters tax amount <taxamount>
	And user clicks on calculate button
	Then it gives final amount <finalamount>
	
		Examples:
		| billingamount | taxamount | finalamount |
		| 100						| 10				| 110					|
		|	292						| 22				| 304					|
		| 150						|	15.5			|	165.5				|
		
	
