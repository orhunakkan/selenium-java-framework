Feature: Validate POST requests with RestAssured

  Scenario: Validate POST request for user creation
    Given The POST API endpoint is "https://reqres.in/api/register"
    And The request body for POST is
    """
    {
       "email": "eve.holt@reqres.in",
       "password": "pistol"
    }
    """
    When A POST request is sent to the API
    Then The POST response status should be 200
    And The response matches the expected JSON schema postSchema
