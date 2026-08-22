package tests;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class verjo {

    public   String Login() {
        return given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "userEmail": "tigranadamyan1994@gmail.com",
                            "userPassword": "Adam212555!!!"
                        }
                        """

                )
                .when()
                .post("https://rahulshettyacademy.com/api/ecom/auth/login")
                .then()
                .extract()
                .path("token");

    }

}
