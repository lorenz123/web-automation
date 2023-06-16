Feature: Register an account using your E-mail

Background:
  When navigates to Homepage
  And I click the Sign Up page


  Scenario: User is already in the Sign-Up page
    Given I am going to click the Email tab
    When I enter a unused email
    And also I enter password as Alphanumerical
    And I also able to click the hidden eye button
    And Click the checkbox of User's Agreement and Privacy Policy
    And I will able to click the Sign Up button successfully
    Then the gee-test will show up to solve the puzzle

