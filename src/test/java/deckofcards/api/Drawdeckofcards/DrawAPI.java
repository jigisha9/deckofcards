/**
 * @author Jigisha Shah
 * @version 1.0
 */
package deckofcards.api.Drawdeckofcards;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.seleniumhq.jetty9.http.HttpStatus;
import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class DrawAPI {
	public static Logger log = Logger.getLogger(DrawAPI.class);

	/**
	 * This function to draw #of cards from deck of cards.
	 * @Param hostUrl
	 */
	public static Response drawAPI(String hostUrl) throws Exception {
		Response resp;
		resp = null;
		Thread.sleep(500);
		try {
			resp =	given()
					.when()
					.get(hostUrl)
					.then().log().all()
					.extract().response();
		} catch (Exception e) {
			log.info("In Catch:" +e.getMessage());
		}
		if (resp.statusCode() >= HttpStatus.INTERNAL_SERVER_ERROR_500) {
			Assert.assertTrue(false, "Internal server error");
		}
		log.info("Sending Response***");
		return resp;

	}



}
