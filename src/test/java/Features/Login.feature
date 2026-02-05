Feature: Login Functionality
  As a registered user of Ndosi Test Automation  I want to login to the application  So that I can access learning materials

  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters email <email>
    And the user enters password <password>
    And the user clicks the login submit button
    Then the user should be logged in successfully
    And the user should be redirected to the learning materials page

    Examples:
      | email               | password     |
      | cucumber@gmail.com  | Cucumber@123 |