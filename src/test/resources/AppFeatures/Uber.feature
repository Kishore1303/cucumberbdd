@All
Feature: Uber booking Feature

@Production @qa-ready @US-101 @EPIC-800
Scenario: Booking cab Sedan
Given User wants to select carType "sedan" from uber application
When User select the car "sedan" and  from "Bangalore" and drop location "Mysore"
Then Driver starts the journey
And Driver ends the journey
Then User pays Fare 5000

@Smoke @Regression
Scenario: Booking cab SUV
Given User wants to select carType "SUV" from uber application
When User select the car "Goa" and  from "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays Fare 2000
Then User checks trip details

@Regression
Scenario: Booking cab XUV
Given  User wants to select carType "XUV" from uber application
When User select the car "Chennai" and  from "Bangalore" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays Fare 1000 

