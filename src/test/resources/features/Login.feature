Feature: Login
  Scenario: Successful login with valid credentials
    Given user is on login page
    When input username "standard_user"
    And input password "secret_sauce"
    And click login button
    Then user is navigated to the home page