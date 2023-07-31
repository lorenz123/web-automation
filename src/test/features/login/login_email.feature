Feature: Login using Email

  Background:
    Given I am Email - Login page

  Scenario Outline: Login using invalid email
    When I input the following invalid emails '<email>'
    Examples:
      | email         |
      | @gmail.com    |
      | awdawdawd.com |
      | awdadwadawd   |
    And I click Login Button
    Then I should be prompted with an error 'The email input format is incorrect'


  Scenario: Login using incorrect password
    When I input an incorrect password
    And I click Login Button
    Then I should be prompted with an error

  Scenario: Login using valid credentials
    When I input valid credentials
    And I click Login Button
    Then I should be prompted with a successful message
    And I should be redirected to Home page
