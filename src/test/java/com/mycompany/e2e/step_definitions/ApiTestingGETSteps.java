package com.mycompany.e2e.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTestingGETSteps {

    private Response response;
    private String endpoint;

    @Given("The GET API endpoint is {string}")
    public void the_get_api_endpoint_is(String url) {
        this.endpoint = url;
    }

    @When("A GET request is sent to the API")
    public void a_get_request_is_sent_to_the_api() {
        response = RestAssured.get(endpoint);
    }

    @Then("The GET response status should be {int}")
    public void the_GET_response_status_should_be(int status) {
        assertEquals(status, response.getStatusCode());
    }

    @Then("The response matches the expected JSON schema getSchema")
    public void the_response_matches_the_expected_json_schema_getSchema() {
        response.then().assertThat().body(matchesJsonSchemaInClasspath("schemas/getSchema.json"));
    }

}
