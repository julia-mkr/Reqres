package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;
import reqres_user_objects.UserDataList;

import static io.restassured.RestAssured.given;

public class ReqresGetUsersFromListTests extends ReqresBaseTest {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;

    public void getUserData(String body, int num) {
        UserDataList userDataList = new Gson().fromJson(body, UserDataList.class);
        id = userDataList.getData().get(num).getId();
        email = userDataList.getData().get(num).getEmail();
        firstName = userDataList.getData().get(num).getFirstName();
        lastName = userDataList.getData().get(num).getLastName();
        avatar = userDataList.getData().get(num).getAvatar();
    }

    @Test
    public void getUserInfoFromListWithId7Test() {
        String body = given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getUserData(body, 0);
        Assert.assertEquals(id, 7);
        Assert.assertEquals(email, "michael.lawson@reqres.in");
        Assert.assertEquals(firstName, "Michael");
        Assert.assertEquals(lastName, "Lawson");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/7-image.jpg");
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
        Assert.assertEquals(id, 8);
        Assert.assertEquals(email, "lindsay.ferguson@reqres.in");
        Assert.assertEquals(firstName, "Lindsay");
        Assert.assertEquals(lastName, "Ferguson");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/8-image.jpg");
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
        Assert.assertEquals(id, 9);
        Assert.assertEquals(email, "tobias.funke@reqres.in");
        Assert.assertEquals(firstName, "Tobias");
        Assert.assertEquals(lastName, "Funke");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/9-image.jpg");
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
        Assert.assertEquals(id, 10);
        Assert.assertEquals(email, "byron.fields@reqres.in");
        Assert.assertEquals(firstName, "Byron");
        Assert.assertEquals(lastName, "Fields");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/10-image.jpg");
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
        Assert.assertEquals(id, 11);
        Assert.assertEquals(email, "george.edwards@reqres.in");
        Assert.assertEquals(firstName, "George");
        Assert.assertEquals(lastName, "Edwards");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/11-image.jpg");
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
        Assert.assertEquals(id, 12);
        Assert.assertEquals(email, "rachel.howell@reqres.in");
        Assert.assertEquals(firstName, "Rachel");
        Assert.assertEquals(lastName, "Howell");
        Assert.assertEquals(avatar, "https://reqres.in/img/faces/12-image.jpg");
    }
}
