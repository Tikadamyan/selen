package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class BookingTest {

    @Test
    public void createBooking() {

        given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "firstname": "Elen",
                            "lastname": "Brown",
                            "totalprice": 111,
                            "depositpaid": true,
                            "bookingdates": {
                                "checkin": "2018-01-01",
                                "checkout": "2019-01-06"
                            },
                            "additionalneeds": "Breakfast"
                        }
                        """)
                .when()
                .post("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200)
                .body("bookingid", notNullValue())
                .body("booking.firstname", notNullValue());
    }

    @Test
    public void getBooking() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://gorest.co.in/public/v2/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void createAuthToken() {

        given()
                .contentType(ContentType.JSON)
                .body("""
                        {
                            "username": "admin",
                            "password": "password123"
                        }
                        """)
                .when()
                .post("https://restful-booker.herokuapp.com/auth")
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}