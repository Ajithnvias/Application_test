Feature: to test group of data

@tagtest
Scenario Outline: vaildate the username/eamil field

Given Access the index page url "https://demo.automationtesting.in/Index.html"
When page loads
Then Enter the vaild "<Emailid>"

 Examples:
 |Emailid|
 |ABCED12gamil.com|
 |AADVWS345gamil.com|

@tagtest
 Scenario: Enter username
 
 Then Entered <username> is correct
 |ajith|nivas|tom|