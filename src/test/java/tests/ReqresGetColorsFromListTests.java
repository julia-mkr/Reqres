package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;
import reqres_color_objects.ColorDataList;

import static io.restassured.RestAssured.given;

public class ReqresGetColorsFromListTests extends ReqresBaseTest {

    private int id;
    private String name;
    private int year;
    private String color;
    private String pantoneValue;

    public void getColorData(String body, int num) {
        ColorDataList colorDataList = new Gson().fromJson(body, ColorDataList.class);
        id = colorDataList.getData().get(num).getId();
        name = colorDataList.getData().get(num).getName();
        year = colorDataList.getData().get(num).getYear();
        color = colorDataList.getData().get(num).getColor();
        pantoneValue = colorDataList.getData().get(num).getPantoneValue();
    }

    @Test
    public void getColorInfoWithId1Test() {
        String body = given()
        .when()
                .get("/unknown")
        .then()
                .statusCode(200)
                .extract().body().asString();
        getColorData(body, 0);
        Assert.assertEquals(id, 1);
        Assert.assertEquals(name, "cerulean");
        Assert.assertEquals(year, 2000);
        Assert.assertEquals(color, "#98B2D1");
        Assert.assertEquals(pantoneValue, "15-4020");
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
        Assert.assertEquals(id, 2);
        Assert.assertEquals(name, "fuchsia rose");
        Assert.assertEquals(year, 2001);
        Assert.assertEquals(color, "#C74375");
        Assert.assertEquals(pantoneValue, "17-2031");
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
        Assert.assertEquals(id, 3);
        Assert.assertEquals(name, "true red");
        Assert.assertEquals(year, 2002);
        Assert.assertEquals(color, "#BF1932");
        Assert.assertEquals(pantoneValue, "19-1664");
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
        Assert.assertEquals(id, 4);
        Assert.assertEquals(name, "aqua sky");
        Assert.assertEquals(year, 2003);
        Assert.assertEquals(color, "#7BC4C4");
        Assert.assertEquals(pantoneValue, "14-4811");
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
        Assert.assertEquals(id, 5);
        Assert.assertEquals(name, "tigerlily");
        Assert.assertEquals(year, 2004);
        Assert.assertEquals(color, "#E2583E");
        Assert.assertEquals(pantoneValue, "17-1456");
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
        Assert.assertEquals(id, 6);
        Assert.assertEquals(name, "blue turquoise");
        Assert.assertEquals(year, 2005);
        Assert.assertEquals(color, "#53B0AE");
        Assert.assertEquals(pantoneValue, "15-5217");
    }
}
