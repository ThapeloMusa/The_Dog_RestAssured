package Votes;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class VotesGetTest extends DogsConfig {

    @DisplayName("getting votes by Sub Id.")
    @Test
    public void getVotesBySubID(){
        given()
                .queryParam("sub_id","my-user-1232")
                .when()
                .get(Endpoints.votes);
    }
}
