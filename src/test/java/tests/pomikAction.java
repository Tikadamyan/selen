package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class pomikAction {
    private String BaseURL= "https://my.mystnodes.com";

    public Response createMy(){

        return given().contentType(ContentType.JSON)
                .body("""
                        {
                            "email": "tigranadamyan1994@gmail.com",
                            "password": "Adam212555444595!" 
                        }
                        """

                )
                .when()
                .post(BaseURL + "/api/v2/auth/login");

    }
}
