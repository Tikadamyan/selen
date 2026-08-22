package tests;
import static org.hamcrest.Matchers.notNullValue;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class pomikTest {
    @Test
    public void loginTest(){
        pomikAction action =new pomikAction();

        Response response = action.createMy();
        int userId = response.jsonPath().getInt("id");


        response
                .then()
                .statusCode(200)
                .body("userId", notNullValue());

    }

}

