
Feature: Online shopping

  In order to do the Online shopping
  As a customer
  I want to do online shopping
  so that i can register

  @Register
  Scenario: registering online
    Given I am navigating to the morrison websits
    And i click on rigester
    When I enter details of newuser
    And I tick on terms&conditions
    Then I click on register
    And I find ful address,select house no,
    And I select my date of birth and gender
    And I enter mobile number and no people
    And I click on continue
