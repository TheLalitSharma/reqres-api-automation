package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import utils.BaseTest;

public class CreateUserTest extends BaseTest {

    @Test(description = "Verify Create User API")
    public void createUser() {
        String payload = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";

        given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));
    }
}
