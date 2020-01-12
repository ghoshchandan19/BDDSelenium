Feature: To test the login functionality of the application


Scenario Outline: To test valid login functionality
Given User is on home page
When user navigates to Login Page
And user enters valid "<username>" and "<password>"
And user clicks on Login Button
Then user succesfully logins into the application
Examples:
    | username   | password |
    | ghoshchandan19@gmail.com | pisoftek@2016 |

Scenario: To test login functionality with invalid password
Given User is on home page
When user navigates to Login Page
And user enters valid username and invalid password
And user clicks on Login Button
Then user gets a message the passord entered is incorrect

Scenario: To test login functionality with invalid username
Given User is on home page
When user navigates to Login Page
And user enters invalid username and valid password
And user clicks on Login Button
Then user gets a message the user could not be found

Scenario: To test login functionality with blank username
Given User is on home page
When user navigates to Login Page
And user enters blank username and valid password
And user clicks on Login Button
Then user gets message username is required



