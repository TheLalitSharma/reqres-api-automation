package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import utils.BaseTest;

public class DeleteUserTest extends BaseTest {

    @Test(description = "Verify Delete User API")
    public void deleteUser() {
        given()
                .header("x-api-key", "reqres-free-v1")
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204);
    }
}
