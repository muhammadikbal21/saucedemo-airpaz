Feature: Success Checkout The Product
  Background:
    Given user is on login page
    When input username "standard_user"
    And input password "secret_sauce"
    And click login button
    Then user is navigated to the home page

  @TestHere
  Scenario: User success checkout the product
    When user click add to cart any product
    And user click cart icon
    And user click checkout button
    And user input first name
    And user input last name
    And user input postal code
    And user click continue button
    And user click finish
    Then user see success information