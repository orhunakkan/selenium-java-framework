package com.mycompany.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ReqresApiTests {

    @Test
    public void getListUsers() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getList("data").isEmpty(), "User list is empty");
    }

    @Test
    public void getSingleUser() {
        Response response = RestAssured.get("https://reqres.in/api/users/2");
        assertEquals(200, response.getStatusCode());
        assertEquals(2, response.jsonPath().getInt("data.id"));
    }

    @Test
    public void getSingleUserNotFound() {
        Response response = RestAssured.get("https://reqres.in/api/users/23");
        assertEquals(404, response.getStatusCode());
    }

    @Test
    public void getListResource() {
        Response response = RestAssured.get("https://reqres.in/api/unknown");
        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getList("data").isEmpty(), "Resource list is empty");
    }

    @Test
    public void getSingleResource() {
        Response response = RestAssured.get("https://reqres.in/api/unknown/2");
        assertEquals(200, response.getStatusCode());
        assertEquals(2, response.jsonPath().getInt("data.id"));
    }

    @Test
    public void getSingleResourceNotFound() {
        Response response = RestAssured.get("https://reqres.in/api/unknown/23");
        assertEquals(404, response.getStatusCode());
    }

    @Test
    public void postCreateUser() {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://reqres.in/api/users");

        assertEquals(201, response.getStatusCode());
        assertEquals("morpheus", response.jsonPath().getString("name"));
        assertEquals("leader", response.jsonPath().getString("job"));
    }

    @Test
    public void putUpdateUser() {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("https://reqres.in/api/users/2");

        assertEquals(200, response.getStatusCode());
        assertEquals("morpheus", response.jsonPath().getString("name"));
        assertEquals("zion resident", response.jsonPath().getString("job"));
    }

    @Test
    public void patchUpdateUser() {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .patch("https://reqres.in/api/users/2");

        assertEquals(200, response.getStatusCode());
        assertEquals("morpheus", response.jsonPath().getString("name"));
        assertEquals("zion resident", response.jsonPath().getString("job"));
    }

    @Test
    public void deleteUser() {
        Response response = RestAssured.delete("https://reqres.in/api/users/2");
        assertEquals(204, response.getStatusCode());
    }

    @Test
    public void postRegisterSuccessful() {
        String requestBody = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://reqres.in/api/register");

        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getString("id").isEmpty());
        assertFalse(response.jsonPath().getString("token").isEmpty());
    }

    @Test
    public void postRegisterUnsuccessful() {
        String requestBody = "{ \"email\": \"sydney@fife\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://reqres.in/api/register");

        assertEquals(400, response.getStatusCode());
        assertEquals("Missing password", response.jsonPath().getString("error"));
    }

    @Test
    public void postLoginSuccessful() {
        String requestBody = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://reqres.in/api/login");

        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getString("token").isEmpty());
    }

    @Test
    public void postLoginUnsuccessful() {
        String requestBody = "{ \"email\": \"peter@klaven\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://reqres.in/api/login");

        assertEquals(400, response.getStatusCode());
        assertEquals("Missing password", response.jsonPath().getString("error"));
    }

    @Test
    public void getDelayedResponse() {
        Response response = RestAssured.get("https://reqres.in/api/users?delay=3");
        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getList("data").isEmpty(), "User list is empty");
    }
}
