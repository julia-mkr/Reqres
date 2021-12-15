package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static utils.ReqresTestUtils.*;

public class ReqresGetUsersFromListTests extends ReqresBaseTest {

    @Test
    public void getUserInfoFromListWithId7Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 0);
        Assert.assertEquals(getId(), 7);
        Assert.assertEquals(getEmail(), "michael.lawson@reqres.in");
        Assert.assertEquals(getFirstName(), "Michael");
        Assert.assertEquals(getLastName(), "Lawson");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/7-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId8Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 1);
        Assert.assertEquals(getId(), 8);
        Assert.assertEquals(getEmail(), "lindsay.ferguson@reqres.in");
        Assert.assertEquals(getFirstName(), "Lindsay");
        Assert.assertEquals(getLastName(), "Ferguson");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/8-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId9Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 2);
        Assert.assertEquals(getId(), 9);
        Assert.assertEquals(getEmail(), "tobias.funke@reqres.in");
        Assert.assertEquals(getFirstName(), "Tobias");
        Assert.assertEquals(getLastName(), "Funke");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/9-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId10Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 3);
        Assert.assertEquals(getId(), 10);
        Assert.assertEquals(getEmail(), "byron.fields@reqres.in");
        Assert.assertEquals(getFirstName(), "Byron");
        Assert.assertEquals(getLastName(), "Fields");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/10-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId11Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 4);
        Assert.assertEquals(getId(), 11);
        Assert.assertEquals(getEmail(), "george.edwards@reqres.in");
        Assert.assertEquals(getFirstName(), "George");
        Assert.assertEquals(getLastName(), "Edwards");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/11-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId12Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 5);
        Assert.assertEquals(getId(), 12);
        Assert.assertEquals(getEmail(), "rachel.howell@reqres.in");
        Assert.assertEquals(getFirstName(), "Rachel");
        Assert.assertEquals(getLastName(), "Howell");
        Assert.assertEquals(getAvatar(), "https://reqres.in/img/faces/12-image.jpg");
    }
}
