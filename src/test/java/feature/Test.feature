Feature: testing home


Scenario: Testing login

Given Access the url "https://www.espncricinfo.com/"
When page loads expand the page
Then Verify the page title
Then close the blower

Scenario: Validate the popup

Given Access the url "https://www.espncricinfo.com/"
When page wait for ten seconds
Then alert popup shoud be displayed
And User should click on cancel