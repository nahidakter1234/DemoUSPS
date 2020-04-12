
Feature: As a user I want to be able to see shop all page
Scenario: User lands on Shop All page

Given User is on Homepage 
When User selects clothing, shoes and accessories 
And User selects Shop All option 
Then Verify Landing 