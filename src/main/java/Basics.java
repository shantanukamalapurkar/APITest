import files.payload;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//This is first commit
public class Basics {
    public static void main(String args[]){
        RestAssured.baseURI  = "https://rahulshettyacademy.com";
        given().queryParam("key","qaclick123")
                .header("Content-Type","application/json")
                .body(payload.AddPlace()).when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200);
                //.header("server","Apache/2.4.41 (Ubuntu)");
       /* given().queryParam("key","qaclick123").queryParam("place_id","0b4cac7d1555df427dd981a6483e457b")
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200);*/

    }
}
