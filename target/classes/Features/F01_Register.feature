@smoke

Feature: F01_Register | users could register with new accounts

  #Test Case 1
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When User Select Gender Type
    And user enter first name "automation"
    And user enter last name "tester"
    And user enter date of birth
    And user enter email "test@example.com" field
    And user fills Password field "P@ssw0rd"
    And user fills Confirm Password field "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed