Feature: To test password change functionality

Scenario Outline: User is able to change password

Given User is on home page of the app
When User enters valid "<username>" and "<password>"
And  User clicks on Login Button
Then User succesfully logins into the application
And User Clicks on change password from dropdown
And User clicks on change password
And User gets message "<message>"

Examples:
    | username   | password | message|
    | chandan@yopmail.com | 123456 |Old password is required|
