package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class ampik {
    @Test
    public void createAmpik(){
        given().contentType(ContentType. JSON)
                .body("""
                        
                        {
                                "firstname" : "Elen",
                "lastname" : "Brown",
                "totalprice" : 111,
                "depositpaid" : true,
                "bookingdates" : {
            "checkin" : "2018-01-01",
                    "checkout" : "2019-01-06"
        },
        "additionalneeds" : "Breakfast"
}
               """
                )
                .when()
                .post("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200)
                .body("booking.bookingdates.checkin", notNullValue())
                .body("booking.firstname", notNullValue())
                .body("bookingid", notNullValue());






    }

}
