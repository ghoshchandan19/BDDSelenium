$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AkashLogin.feature");
formatter.feature({
  "name": "To test the login functionality of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test valid login functionality of elearning app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User is on home page of the app",
  "keyword": "Given "
});
formatter.step({
  "name": "User click os login button",
  "keyword": "When "
});
formatter.step({
  "name": "User enters valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User succesfully logins into the application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ghoshchandan19@gmail.com",
        "Test@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test valid login functionality of elearning app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User is on home page of the app",
  "keyword": "Given "
});
formatter.match({
  "location": "AkashLoginSteps.user_is_on_home_page_of_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click os login button",
  "keyword": "When "
});
formatter.match({
  "location": "AkashLoginSteps.user_click_os_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"ghoshchandan19@gmail.com\" and \"Test@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "AkashLoginSteps.user_enters_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "AkashLoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User succesfully logins into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "AkashLoginSteps.user_succesfully_logins_into_the_application()"
});
formatter.result({
  "status": "passed"
});
});