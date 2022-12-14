@smoke

Feature: F02_Login | users could use login functionality to use their accounts

    #Test Case 2
  Scenario: users could use login functionality to use their accounts
    Given user go to login page
    When user login with valid Email and Password
    Then user press on login button
    And user login to the system successfully

    #Test Case 3
  Scenario: user could login with invalid email and password
    Given User go to login page
    When user login with invalid Email and Password
    Then User press on login button
    And user login to the system unsuccessfully
