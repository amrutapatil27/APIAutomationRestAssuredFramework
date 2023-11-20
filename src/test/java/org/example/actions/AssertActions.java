package org.example.actions;

import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class AssertActions {
    public void verifyStatusCode(Response response){
        assertEquals("Value of Status code is :" + response.getStatusCode(), String.valueOf(response.getStatusCode()).startsWith("20"),
                true);
    }
    public void verifyResponseBody(String actual, String expected, String description){
        assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(float actual, float expected, String description){
        assertEquals(String.valueOf(actual),expected,description);
    }
    public void verifyResponseBody(int actual, int expected, String description){
        assertEquals(String.valueOf(actual),expected,description);
    }
    public void verifyResponseBody(double actual, double expected, String description){
        assertEquals(String.valueOf(actual),expected,description);
    }
}
