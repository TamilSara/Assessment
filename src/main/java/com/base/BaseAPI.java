package com.base;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BaseAPI {
    public BaseAPI() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    // Method to send POST request
    public Response sendPostRequest(String endpoint, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }
}
