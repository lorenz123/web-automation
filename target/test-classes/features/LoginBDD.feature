Feature: Login

  Background:
    Given I am at homepage and will click X button of the modal to navigate in Login page
    And Click the Login button page
    And I will click the Email tab button first

  Scenario: Login using Valid email account
    When I Enter a valid email address
    And I enter valid password
    And Click the hide eye button
    Then should click the login button to show the gee-test

  Scenario Outline: Login using Invalid email account
    When I Enter a invalid email address
    And I enter valid password
    And Click the hide eye button
    Then will not click the Login button
    Examples:

  Scenario Outline: Login using Invalid password
    When I Enter a valid email address
    And I enter valid password
    And Click the hide eye button
    Then will Click the Login button
    Examples:







