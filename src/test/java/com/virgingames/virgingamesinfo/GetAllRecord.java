package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

import java.util.HashMap;

import static net.serenitybdd.rest.RestRequests.given;

public class GetAllRecord extends TestBase {
    @Test
    public void getAllData() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        Response response = given()
                .when()
                .get(EndPoints.GET_BINGO);


        response.then().log().all()
                .statusCode(200);
       // response.prettyPrint();

    }


}
