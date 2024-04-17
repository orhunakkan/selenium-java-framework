Feature: Validate GET requests with RestAssured

  Scenario: Validate GET request for different endpoints
    Given The GET API endpoint is "https://reqres.in/api/users/2"
    When A GET request is sent to the API
    Then The GET response status should be 200
    And The response matches the expected JSON schema getSchema
