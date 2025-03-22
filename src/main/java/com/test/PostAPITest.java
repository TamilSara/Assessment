package com.test;



import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseAPI;

public class PostAPITest extends BaseAPI {

    @Test
    public void testCreateUser() {
        String requestBody = "{ \"name\": \"John\", \"job\": \"QA Engineer\" }";
        Response response = sendPostRequest("/users", requestBody);

        Assert.assertEquals(response.getStatusCode(), 201, "User creation failed!");
        Assert.assertEquals(response.jsonPath().getString("name"), "John", "Incorrect name in response!");
    }
}
