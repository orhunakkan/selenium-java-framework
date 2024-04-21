Feature: Excel Data Driven Testing

  Scenario: Test login functionality using data from Excel file
    Given I have the data from the Excel file
    When I perform the login
    Then I verify the login results
