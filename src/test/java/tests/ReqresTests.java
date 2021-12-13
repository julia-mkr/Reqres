package tests;

import org.testng.annotations.Test;
import reqres_user_objects.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class ReqresTests extends ReqresBaseTest {

    @Test
    public void updateUserInfoWithPutTest() {
        User user = User.builder()
                .name("morpheus")
                .job("zion resident")
                .build();
        given()
                .body(user)
        .when()
                .put("/users2")
        .then()
                .log().all()
                .statusCode(200)
                .body("updatedAt", is(notNullValue()));
    }

    @Test
    public void updateUserInfoWithPatchTest() {
        User user = User.builder()
                .name("morpheus")
                .job("zion resident")
                .build();
        given()
                .body(user)
        .when()
                .patch("/users2")
        .then()
                .log().all()
                .statusCode(200)
                .body("updatedAt", is(notNullValue()));
    }

    @Test
    public void deleteUserTest() {
        given()
        .when()
                .delete("/users/2")
        .then()
                .log().all()
                .statusCode(204);
    }
}
