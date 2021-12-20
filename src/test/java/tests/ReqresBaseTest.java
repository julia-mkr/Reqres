package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import static io.restassured.RestAssured.basePath;

public class ReqresBaseTest {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
        basePath = "/api";
    }
}
