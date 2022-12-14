@smoke
Feature: F03_Currencies | user can change currency to euro

  Scenario: Guest User Can Change Currency To Euro

    Given User Select Euro Currency
    Then Verify All Products Price is in Euros
