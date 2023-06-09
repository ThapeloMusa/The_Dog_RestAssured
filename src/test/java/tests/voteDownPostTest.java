package tests;

import config.DogsConfig;
import config.Endpoints;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class voteDownPostTest extends DogsConfig {

    @DisplayName("creating a vote down Json object")
    @Test
    public void testThatICanCreateVoteDown(){

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();

        String voteBodyJson ="{\n" +
                "\t\"image_id\":\"dfgtgh\",\n" +
                "\t\"sub_id\": \"my-user-1234\",\n" +
                "\t\"value\":0\n" +
                "}";

        given()
                .body(voteBodyJson)
                .when()
                .post(Endpoints.votes)
                .then()
                .log()
                .all()

        ;

    }
}
