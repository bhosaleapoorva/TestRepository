$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "To perform login operation",
  "description": "",
  "id": "to-perform-login-operation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Login to the application case2",
  "description": "",
  "id": "to-perform-login-operation;login-to-the-application-case2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "signin is not successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 11451486200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_signin_button()"
});
formatter.result({
  "duration": 2791610600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.signin_is_not_successful()"
});
formatter.result({
  "duration": 191900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login to the application case3",
  "description": "",
  "id": "to-perform-login-operation;login-to-the-application-case3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "apoorva",
        "test123"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "signin is not successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 7654815500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2523100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.signin_is_not_successful()"
});
formatter.result({
  "duration": 103300,
  "status": "passed"
});
});