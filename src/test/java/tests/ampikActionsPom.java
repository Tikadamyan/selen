package tests;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class ampikActionsPom{

    public Response createAmpik(){
      return  given().contentType(ContentType. JSON)
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
                .post("https://restful-booker.herokuapp.com/booking");



    }

}
