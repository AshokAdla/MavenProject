Feature: CreateLead functionality of Leaftaps application

Scenario Outline: CreateLead functionality with Mandatory fields

##preCondition
#Given Launch the browser
#And Load the url

And Enter the Username as 'demoCSR'
And Enter the password as 'crmsfa'
#testCondition
When Click on Login button
#expected positive result 
Then Welcome page is displayed

When Click on CRMSFA link
When Click on Leads Link
When Click on Create Lead link
When Enter the companyname as <cname>
When Enter the firstName as <fname>
When Enter the lastName as <lname>

When Click on Create Button
Then Viewlead page is displayed
#Then Close the browser

Examples:
|cname|fname|lname|
|'Testleaf'|'Vidya'|'R'|
|'Wipro'|'Ramesh'|'A'|

