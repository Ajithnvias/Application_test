Feature: testing register page

@smoke
Scenario: vaildate the username/eamil field

Given Access the index page url
When page loads
Then Enter the vaild Email id
And take a screenshot

