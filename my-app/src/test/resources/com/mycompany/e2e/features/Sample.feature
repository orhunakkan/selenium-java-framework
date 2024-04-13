Feature: Validate webpage title

  Scenario: User visits the Selenium WebDriver with Java page and checks the title
    Given the user has navigated to the Selenium WebDriver Java tutorial page
    When the user retrieves the page title
    Then the page title should be "Hands-On Selenium WebDriver with Java"
