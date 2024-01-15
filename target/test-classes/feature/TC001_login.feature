Feature: Login functionality of Leaftaps application

#To configure preconditions of all scenarios
#Background: 
##preCondition
#Given Launch the browser
#And Load the url

Scenario: Login functionality with positive credentials

And Enter the Username as 'demoCSR'
And Enter the password as 'crmsfa'
#testCondition
When Click on Login button
#expected positive result 
Then Welcome page is displayed
When Click on CRMSFA link
#Then Close the browser

Scenario: Login functionality with Invalid credentials

And Enter the Username as 'demo@123'
And Enter the password as 'crmsfa'
#testCondition 
When Click on Login button
#expected negative result 
But Error message is displayed
#Then Close the browser

