package tests;


import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class BookingTest2 {

    @Test
    public void createBooking() {

        BookingClient bookingClient = new BookingClient();

        bookingClient.createBooking()
                .then()
                .statusCode(200)
                .body("bookingid", notNullValue())
                .body("booking.firstname", equalTo("Elen"))
                .body("booking.lastname", equalTo("Brown"))
                .body("booking.totalprice", equalTo(111))
                .body("booking.depositpaid", equalTo(true));
    }
}