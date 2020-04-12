
Feature: As a user I want to land on the Walmart homepage
Scenario Outline:User should be able to Login
	
	Given Browse to Walmart homepage 
	When  User provide correct "<Username>" "<Password>"
	Then  Verify login

    Examples:
	|Username                  |Password|              
	|raselkhanwalmart@gmail.com|123456abC|
	
