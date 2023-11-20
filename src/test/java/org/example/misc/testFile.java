package org.example.misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class testFile {
    @Test
    public void postRequest() {
        String payload = "{\n " +
                "   \"username\" : \"admin\",\n" +
                "   \"password\" : \"password123\"\n" +
                "}";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("auth")
                .contentType(ContentType.JSON)
                .when().body(payload).post()
                .then().log().all().statusCode(200);
    }
  // run testng.xml to execute this test
    // to generate report using allure use following command
    //Goto Terminal
    //allure generate --clean
    //allure serve allure-results
    // allure open (some times this command is necessary if results are not showing)
}
