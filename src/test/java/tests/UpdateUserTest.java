package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import utils.BaseTest;

public class UpdateUserTest extends BaseTest {

    @Test(description = "Verify Update User API")
    public void updateUser() {
        String payload = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";

        given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .body("job", equalTo("zion resident"));
    }
}
