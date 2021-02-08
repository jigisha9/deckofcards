/**
 * @author Jigisha Shah
 * @version 1.0
 */
package deckofcards.testsuites;
import deckofcards.api.Drawdeckofcards.DrawAPI;
import deckofcards.utils.Constant;
import io.restassured.response.Response;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class Drawdeckofcardstestsuite {
	public static Logger log = Logger.getLogger(Createdeckofcardstestsuite.class);
	public static String baseUrl;
	public static String endpoint;
	public static String contentroot;
	public static String draw;

	@BeforeClass(alwaysRun = true)
	public void beforeClass(ITestContext context) throws Exception {
		this.contentroot = System.getProperty("url");
		this.endpoint = Constant.Draw_ENDPOINT;
		this.draw = System.getProperty("draw");
		log.info("Contentroot for Deck of cards: " + this.contentroot);

	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(ITestContext context, Method testMethod) throws Exception{
		Thread.sleep(200);
		System.out.println("*******************************************************************************************************");
		System.out.println("                                       "+testMethod.getName());
		System.out.println("*******************************************************************************************************");
	}
	/**
	 * This test Draw one or more cards from deck
	 */
	@Test
	public void drawDeckofcardsTC001() throws Exception {
		log.info("***** GET Call drawDeckofcardsTC001 Initiating *********");
		Response resp;
		this.baseUrl = this.contentroot + this.endpoint + this.draw;
		System.out.println(this.baseUrl);
		 resp = DrawAPI.drawAPI(this.baseUrl);
		log.info("***** GET Call drawDeckofcardsTC001 ended *********");
		log.info(resp.asString());
		Assert.assertTrue(resp.getStatusCode()==HttpStatus.SC_OK,"*****Test Failed****** Status Code is "+resp.statusCode()+" "+resp.getBody().asString());
		Assert.assertTrue(resp.body().asString().contains("\"success\": true"),"Invalid response"+resp.body().asString());

	}


}
