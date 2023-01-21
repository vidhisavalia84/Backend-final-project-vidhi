package com.virgingames.virgingamesinfo;

import com.google.common.net.MediaType;
import com.virgingames.constants.Path;
import io.restassured.RestAssured;
import com.virgingames.constants.EndPoints;
import com.virgingames.testbase.TestBase;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
//import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.rest.SerenityRest;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;

import java.util.List;

import static org.hamcrest.Matchers.*;

public class VirginGameAssertDemo extends TestBase {


    static ValidatableResponse response;

    @BeforeClass
    public void getAllData() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        response = given()
                .when()
                .get(EndPoints.GET_BINGO)
                .then()
                .statusCode(200);

    }

    //checking that default game frequency is  equal to 300000
    @Test
    public void test002() {
        response.body("bingoLobbyInfoResource.streams[0].defaultGameFrequency", equalTo(300000));


    }
}
