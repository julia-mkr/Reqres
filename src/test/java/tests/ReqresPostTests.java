package tests;

import org.testng.annotations.Test;
import reqres_user_objects.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqresPostTests extends ReqresBaseTest {

    @Test
    public void postCreateUserTest() {
        User user = User.builder()
                .name("morpheus")
                .job("leader")
                .build();
        given()
                .body(user)
        .when()
                .post("/users")
        .then()
                .log().all()
                .statusCode(201)
                .body("id", is(notNullValue()))
                .body("createdAt", is(notNullValue()));
    }

    @Test
    public void registerSuccessfullyTest() {
        UserForRegistrationAndLogin user = UserForRegistrationAndLogin.builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        given()
                .body(user)
        .when()
                .post("/register")
        .then()
                .log().all()
                .statusCode(200)
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
//        After sending a post request, the error 'Missing email or username' appears and the status code is 400
    }

    @Test
    public void registerUnsuccessfullyTest() {
        UserForRegistrationAndLogin user = UserForRegistrationAndLogin.builder()
                .email("sydney@fife")
                .build();
        given()
                .body(user)
        .when()
                .post("/register")
        .then()
                .log().all()
                .statusCode(400)
                .body("error", equalTo("Missing email or username"));
    }

    @Test
    public void loginSuccessfullyTest() {
        UserForRegistrationAndLogin user = UserForRegistrationAndLogin.builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();
        given()
                .body(user)
        .when()
                .post("/login")
        .then()
                .log().all()
                .statusCode(200)
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
//        After sending a post request, the error 'Missing email or username' appears and the status code is 400
    }

    @Test
    public void loginUnsuccessfullyTest() {
        UserForRegistrationAndLogin user = UserForRegistrationAndLogin.builder()
                .email("peter@klaven")
                .build();
        given()
                .body(user)
        .when()
                .post("/login")
        .then()
                .log().all()
                .statusCode(400)
                .body("error", equalTo("Missing email or username"));
    }
}
