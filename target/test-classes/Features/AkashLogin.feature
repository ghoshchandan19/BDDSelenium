Feature: To test the login functionality of the application




@Smoke
Scenario Outline: To test valid login functionality of elearning app
Given User is on home page of the app
When User click os login button
When User enters valid "<username>" and "<password>"
And  User clicks on Login Button
Then User succesfully logins into the application

Examples:
    | username   | password |
    | ghoshchandan19@gmail.com | Test@123 |