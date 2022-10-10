#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Amazon search

Scenario: Search a Product Iphone
Given I have a Search text field on Amazon page
When I Search a product name "Iphone" and price 50000
Then Product with name "Iphone" should be displayed
Then Order id 2618 and username is "Kishore M V"

Scenario: Search a Product Macbook Air
Given I have a Search text field on Amazon page
When I Search a product name "Macbook Air" and price 85000
Then Product with name "Macbook Air" should be displayed
Then Order id 2567 and username is "Kishore"

