Feature: To validate the loginFunctionality of Rehlat travel app

  Scenario Outline: 
    : To Validate tha login Functionality with Invalid Credentials data

    Given the User Should be Login Pagelocation
    When the user has to fill user and pass details
    And the has to click login button
    Then finally quit the login page

    Examples: 
      | rtcvybh               |    5152652 |
      | starajit005@gmail.com | Jamkan@005 |
