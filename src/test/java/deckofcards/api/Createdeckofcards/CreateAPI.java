/**
 * @author Jigisha Shah
 * @version 1.0
 */
package deckofcards.api.Createdeckofcards;
import deckofcards.testsuites.Createdeckofcardstestsuite;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.seleniumhq.jetty9.http.HttpStatus;
import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class CreateAPI {
	public static Logger log = Logger.getLogger(CreateAPI.class);

	/**
	 * This method creates Brand New deck and returns response
	 * @param hostUrl
	 */
	public static Response createnewAPI(String hostUrl) throws Exception {
		Response resp;
		resp = null;
		Thread.sleep(500);
		try {
			resp =	given()
					.when()
					.get(hostUrl)
					.then().log().all()
					.extract().response();
		} catch (Exception e){
			log.info("In catch "+e.getMessage());
		}

		if (resp.statusCode() >= HttpStatus.INTERNAL_SERVER_ERROR_500) {
			Assert.assertTrue(false, "Internal server error");
		}
		log.info("Sending Response***");
		return resp;

	}
	/**
	 * This method Supports adding Jokers with a POST method
	 * @param hostUrl, payload
	 */
	public static Response createwithJokerAPI(String hostUrl, String payload) throws Exception {
		Response resp;
		resp = null;
		Thread.sleep(1000);
		try {
			resp = given()
					.contentType(ContentType.JSON)
					.body(payload)
				//	.header("jokers_enabled", true)
				//	.contentType("multipart/form-data")
					.when()
					.post(hostUrl)
					.then().log().all()
					.extract().response();
		} catch (Exception e) {
			System.out.println("In Catch:" +e.getMessage());

		}
		if (resp.statusCode() >= HttpStatus.INTERNAL_SERVER_ERROR_500) {
			Assert.assertTrue(false, "Internal server error");
		}
		System.out.println("Sending Response***");
		return resp;

	}

}
