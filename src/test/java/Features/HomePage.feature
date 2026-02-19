@Smoke
Feature: Home page check
  As a registered user of Ndosi Test Automation  I want to login to the application  So that I can access learning materials

  Background:
    Given the user is on the login page

  Scenario Outline: Verify home page
    When the user enters email <email>
    And the user enters password <password>
    And the user clicks the login submit button
    Then the user should be logged in successfully

    Examples:
      | email               | password     |
      | cucumber@gmail.com  | Cucumber@123 |