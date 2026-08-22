package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.notNullValue;

public class ampikTestPom {
    @Test
public void logintest(){
        ampikActionsPom action =new ampikActionsPom();
        Response response = action.createAmpik();
        response
                .then()
                .statusCode(200)
                .body("booking.bookingdates.checkin", notNullValue())
                .body("booking.firstname", notNullValue())
                .body("bookingid", notNullValue());
        int bookingId = response.jsonPath().getInt("bookingid");
        System.out.println(bookingId);
    }
}
