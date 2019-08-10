@Login
Feature: Acceptance Testing of Valid Login
  In Order to validate the Login functionality need to provide user credentials

  @valid-Login
  Scenario: Login into Application with valid credentials
    Given I want to navigate the url
    When I provide the valid username
    When I provide the valid password
    And click on Login Button
   
