$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the loginFunctionality of Rehlat travel app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "    : To Validate tha login Functionality with Invalid Credentials data",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the User Should be Login Pagelocation",
  "keyword": "Given "
});
formatter.step({
  "name": "the user has to fill user and pass details",
  "keyword": "When "
});
formatter.step({
  "name": "the has to click login button",
  "keyword": "And "
});
formatter.step({
  "name": "finally quit the login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rtcvybh",
        "5152652"
      ]
    },
    {
      "cells": [
        "starajit005@gmail.com",
        "Jamkan@005"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    : To Validate tha login Functionality with Invalid Credentials data",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the User Should be Login Pagelocation",
  "keyword": "Given "
});
formatter.match({
  "location": "login.the_User_Should_be_Login_Pagelocation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has to fill user and pass details",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.the_has_to_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "finally quit the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.finally_quit_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
});