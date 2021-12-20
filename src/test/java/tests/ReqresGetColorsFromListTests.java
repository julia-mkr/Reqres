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
        Assert.assertEquals(getColorData(body, 0).getId(), 1);
        Assert.assertEquals(getColorData(body, 0).getName(), "cerulean");
        Assert.assertEquals(getColorData(body, 0).getYear(), 2000);
        Assert.assertEquals(getColorData(body, 0).getColor(), "#98B2D1");
        Assert.assertEquals(getColorData(body, 0).getPantoneValue(), "15-4020");
    }

    @Test
    public void getColorInfoWithId2Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getColorData(body, 1).getId(), 2);
        Assert.assertEquals(getColorData(body, 1).getName(), "fuchsia rose");
        Assert.assertEquals(getColorData(body, 1).getYear(), 2001);
        Assert.assertEquals(getColorData(body, 1).getColor(), "#C74375");
        Assert.assertEquals(getColorData(body, 1).getPantoneValue(), "17-2031");
    }

    @Test
    public void getColorInfoWithId3Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getColorData(body, 2).getId(), 3);
        Assert.assertEquals(getColorData(body, 2).getName(), "true red");
        Assert.assertEquals(getColorData(body, 2).getYear(), 2002);
        Assert.assertEquals(getColorData(body, 2).getColor(), "#BF1932");
        Assert.assertEquals(getColorData(body, 2).getPantoneValue(), "19-1664");
    }

    @Test
    public void getColorInfoWithId4Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getColorData(body, 3).getId(), 4);
        Assert.assertEquals(getColorData(body, 3).getName(), "aqua sky");
        Assert.assertEquals(getColorData(body, 3).getYear(), 2003);
        Assert.assertEquals(getColorData(body, 3).getColor(), "#7BC4C4");
        Assert.assertEquals(getColorData(body, 3).getPantoneValue(), "14-4811");
    }

    @Test
    public void getColorInfoWithId5Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getColorData(body, 4).getId(), 5);
        Assert.assertEquals(getColorData(body, 4).getName(), "tigerlily");
        Assert.assertEquals(getColorData(body, 4).getYear(), 2004);
        Assert.assertEquals(getColorData(body, 4).getColor(), "#E2583E");
        Assert.assertEquals(getColorData(body, 4).getPantoneValue(), "17-1456");
    }

    @Test
    public void getColorInfoWithId6Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        Assert.assertEquals(getColorData(body, 5).getId(), 6);
        Assert.assertEquals(getColorData(body, 5).getName(), "blue turquoise");
        Assert.assertEquals(getColorData(body, 5).getYear(), 2005);
        Assert.assertEquals(getColorData(body, 5).getColor(), "#53B0AE");
        Assert.assertEquals(getColorData(body, 5).getPantoneValue(), "15-5217");
    }
}
