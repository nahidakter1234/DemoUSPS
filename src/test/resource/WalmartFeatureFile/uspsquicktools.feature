Feature: find elements on quickstools
Scenario Outline: quicktools zipcode

Given Look for a specific location
When A correct  zipcode is provided "<Zip>" 
Then All info available will be shown

Examples:
|Zip|
|11433|