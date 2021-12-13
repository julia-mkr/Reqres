package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqresGetTests extends ReqresBaseTest {

    @Test
    public void getSingleUserTest() {
        given()
        .when()
                .get("/users/2")
        .then()
                .log().all()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"));;
    }

    @Test
    public void getSingleUserNotFoundTest() {
        given()
        .when()
                .get("/users/23")
        .then()
                .log().all()
                .statusCode(404)
                .body(is("{}"));
    }

    @Test
    public void getSingleResourceTest() {
        given()
        .when()
                .get("/unknown/2")
        .then()
                .log().all()
                .statusCode(200)
                .body("data.name", equalTo("fuchsia rose"))
                .body("data.year", equalTo(2001))
                .body("data.color", equalTo("#C74375"))
                .body("data.pantone_value", equalTo("17-2031"));
    }

    @Test
    public void getSingleResourceNotFoundTest() {
        given()
        .when()
                .get("/unknown/23")
        .then()
                .log().all()
                .statusCode(404)
                .body(is("{}"));
    }

    @Test
    public void getDelayedResponseTest() {
        given()
        .when()
                .get("/users?page=2")
        .then()
                .log().all()
                .statusCode(200)
                .body("data.id", hasItems(7, 8, 9, 10, 11, 12));
    }
}
