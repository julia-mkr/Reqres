package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static utils.ReqresTestUtils.*;

public class ReqresGetColorsFromListTests extends ReqresBaseTest {

    @Test
    public void getColorInfoWithId1Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 0);
        Assert.assertEquals(getId(), 1);
        Assert.assertEquals(getName(), "cerulean");
        Assert.assertEquals(getYear(), 2000);
        Assert.assertEquals(getColor(), "#98B2D1");
        Assert.assertEquals(getPantoneValue(), "15-4020");
    }

    @Test
    public void getColorInfoWithId2Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 1);
        Assert.assertEquals(getId(), 2);
        Assert.assertEquals(getName(), "fuchsia rose");
        Assert.assertEquals(getYear(), 2001);
        Assert.assertEquals(getColor(), "#C74375");
        Assert.assertEquals(getPantoneValue(), "17-2031");
    }

    @Test
    public void getColorInfoWithId3Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 2);
        Assert.assertEquals(getId(), 3);
        Assert.assertEquals(getName(), "true red");
        Assert.assertEquals(getYear(), 2002);
        Assert.assertEquals(getColor(), "#BF1932");
        Assert.assertEquals(getPantoneValue(), "19-1664");
    }

    @Test
    public void getColorInfoWithId4Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 3);
        Assert.assertEquals(getId(), 4);
        Assert.assertEquals(getName(), "aqua sky");
        Assert.assertEquals(getYear(), 2003);
        Assert.assertEquals(getColor(), "#7BC4C4");
        Assert.assertEquals(getPantoneValue(), "14-4811");
    }

    @Test
    public void getColorInfoWithId5Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 4);
        Assert.assertEquals(getId(), 5);
        Assert.assertEquals(getName(), "tigerlily");
        Assert.assertEquals(getYear(), 2004);
        Assert.assertEquals(getColor(), "#E2583E");
        Assert.assertEquals(getPantoneValue(), "17-1456");
    }

    @Test
    public void getColorInfoWithId6Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 5);
        Assert.assertEquals(getId(), 6);
        Assert.assertEquals(getName(), "blue turquoise");
        Assert.assertEquals(getYear(), 2005);
        Assert.assertEquals(getColor(), "#53B0AE");
        Assert.assertEquals(getPantoneValue(), "15-5217");
    }
}
