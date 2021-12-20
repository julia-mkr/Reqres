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
        Assert.assertEquals(getUserData(body, 0).getId(), 7);
        Assert.assertEquals(getUserData(body, 0).getEmail(), "michael.lawson@reqres.in");
        Assert.assertEquals(getUserData(body, 0).getFirstName(), "Michael");
        Assert.assertEquals(getUserData(body, 0).getLastName(), "Lawson");
        Assert.assertEquals(getUserData(body, 0).getAvatar(), "https://reqres.in/img/faces/7-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId8Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getUserData(body, 1).getId(), 8);
        Assert.assertEquals(getUserData(body, 1).getEmail(), "lindsay.ferguson@reqres.in");
        Assert.assertEquals(getUserData(body, 1).getFirstName(), "Lindsay");
        Assert.assertEquals(getUserData(body, 1).getLastName(), "Ferguson");
        Assert.assertEquals(getUserData(body, 1).getAvatar(), "https://reqres.in/img/faces/8-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId9Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getUserData(body, 2).getId(), 9);
        Assert.assertEquals(getUserData(body, 2).getEmail(), "tobias.funke@reqres.in");
        Assert.assertEquals(getUserData(body, 2).getFirstName(), "Tobias");
        Assert.assertEquals(getUserData(body, 2).getLastName(), "Funke");
        Assert.assertEquals(getUserData(body, 2).getAvatar(), "https://reqres.in/img/faces/9-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId10Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getUserData(body, 3).getId(), 10);
        Assert.assertEquals(getUserData(body, 3).getEmail(), "byron.fields@reqres.in");
        Assert.assertEquals(getUserData(body, 3).getFirstName(), "Byron");
        Assert.assertEquals(getUserData(body, 3).getLastName(), "Fields");
        Assert.assertEquals(getUserData(body, 3).getAvatar(), "https://reqres.in/img/faces/10-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId11Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getUserData(body, 4).getId(), 11);
        Assert.assertEquals(getUserData(body, 4).getEmail(), "george.edwards@reqres.in");
        Assert.assertEquals(getUserData(body, 4).getFirstName(), "George");
        Assert.assertEquals(getUserData(body, 4).getLastName(), "Edwards");
        Assert.assertEquals(getUserData(body, 4).getAvatar(), "https://reqres.in/img/faces/11-image.jpg");
    }

    @Test
    public void getUserInfoFromListWithId12Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getUserData(body, 5).getId(), 12);
        Assert.assertEquals(getUserData(body, 5).getEmail(), "rachel.howell@reqres.in");
        Assert.assertEquals(getUserData(body, 5).getFirstName(), "Rachel");
        Assert.assertEquals(getUserData(body, 5).getLastName(), "Howell");
        Assert.assertEquals(getUserData(body, 5).getAvatar(), "https://reqres.in/img/faces/12-image.jpg");
    }
}
