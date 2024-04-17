package com.mycompany.e2e.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTestingPOSTSteps {

    private Response response;
    private String endpoint;
    private String requestBody;

    @Given("The POST API endpoint is {string}")
    public void the_post_api_endpoint_is(String url) {
        this.endpoint = url;
    }

    @Given("The request body for POST is")
    public void the_request_body_for_post_is(String body) {
        this.requestBody = body;
    }

    @When("A POST request is sent to the API")
    public void a_post_request_is_sent_to_the_api() {
        response = RestAssured.given().contentType("application/json").body(requestBody).post(endpoint);
    }

    @Then("The POST response status should be {int}")
    public void the_POST_response_status_should_be(int status) {
        assertEquals(status, response.getStatusCode());
    }

    @Then("The response matches the expected JSON schema postSchema")
    public void the_response_matches_the_expected_json_schema_postSchema() {
        response.then().assertThat().body(matchesJsonSchemaInClasspath("schemas/postSchema.json"));
    }

}
