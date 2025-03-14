package demo.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void testApiCheck() {
        // Set base URI for API tests
        RestAssured.baseURI = "https://www.saucedemo.com/";

        // Perform a GET request to the cart endpoint
        Response response = given()
                .when()
                .get("cart.html")
                .then()
                .statusCode(200) // Ensure response status is 200 OK
                .extract()
                .response();

        // Validate response status code
        Assert.assertEquals(response.getStatusCode(), 200, "API check failed");
    }
}
