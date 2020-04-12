@regression 
Feature: USPS Tracking 
Scenario Outline: Search for a tracking Number 

	Given User on Homepage 
	When  User provides a tracking "<Number>" 
	And   Looks for package information 
	Then User gets tracking information 
	
	Examples: 
		|Number  |
		|07710600|