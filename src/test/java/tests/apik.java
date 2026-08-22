package tests;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.given;


public class apik {


    public String loginTest() {

       return given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "email": "tigranadamyan1994@gmail.com",
                            "password": "Adam212555!!!"
                        }
                        """)
                .when()
                .post("https://api.eventhub.rahulshettyacademy.com/api/auth/login")
                .then()
                .extract()
                .path("token");
    }
}