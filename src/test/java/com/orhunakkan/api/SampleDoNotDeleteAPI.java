package com.orhunakkan.api;

import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.restassured.RestAssured;

public class SampleDoNotDeleteAPI {

    @Test
    public void validateStatusCode() {

        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        assertEquals(response.statusCode(), 200);

    }
}
