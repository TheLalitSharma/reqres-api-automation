package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import utils.BaseTest;

public class GetUsersTest extends BaseTest {

    @Test(description = "Verify List Users API")
    public void getListUsers() {
        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("data.size()", greaterThan(0));
    }
}
