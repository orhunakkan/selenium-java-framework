Feature: Login Page usernames

  Scenario: Validate standard username on login page
    Given user go to https://www.saucedemo.com/
    Then user sees all the usernames and validate the text of standard username
