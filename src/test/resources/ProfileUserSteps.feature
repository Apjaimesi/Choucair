Feature: Profile User

  Background: Enter to the a new experience HomePage
    Given the user open the test page "http://automationpractice.com/index.php"
    And the user should click the button Sign in

  Scenario: TC001: Create a user account
    Given the user is in the Authentication page
    And the user writes a valid email
    When the user press click the button Create an account
    Then the user should add your personal information
    And the user should click the button Register

  Scenario: TC002: Login user
    Given the user is in the Authentication page
    When the user writes a valid email "test1234@mail.com" and a valid password "123456"
    Then the user should click the button Sign in to Login into the account



