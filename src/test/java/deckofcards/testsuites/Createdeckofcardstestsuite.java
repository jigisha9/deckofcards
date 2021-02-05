/**
 * @author Jigisha Shah
 * @version 1.0
 */
package deckofcards.testsuites;
import java.lang.reflect.Method;
import deckofcards.api.Createdeckofcards.CreateAPI;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import deckofcards.utils.Constant;
import io.restassured.response.Response;

public class Createdeckofcardstestsuite {
	public static Logger log = Logger.getLogger(Createdeckofcardstestsuite.class);
	public static String baseUrl;
    public static String endpoint;
    public static String contentroot;
	public static String payload;

	@BeforeClass(alwaysRun = true)
	public void beforeClass(ITestContext context) throws Exception {
		this.contentroot = System.getProperty("url");
		System.out.println("Contentroot for Deck of cards: " + this.contentroot);
		this.endpoint = Constant.Create_ENDPOINT;
		this.payload = "{\"jokers_enabled\": true}";
	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(ITestContext context, Method testMethod) throws Exception{
		Thread.sleep(200);
		System.out.println("*******************************************************************************************************");
		System.out.println("                                       "+testMethod.getName());
		System.out.println("*******************************************************************************************************");
	}
	/**
	 * This test verifies Brand New deck with response as "Success"
	 */
	@Test
	public void CreateDeckofcardsTC001() throws Exception {
		log.info("***** GET Call CreateDeckofcardsTC001 Initiating *********");
		Response resp;
		this.baseUrl = this.contentroot + this.endpoint;
		System.out.println(this.baseUrl);
		 resp = CreateAPI.createnewAPI(this.baseUrl);
		log.info("***** GET Call CreateDeckofcardsTC001 ended *********");
		//Verify HTTP status code and JSON response contains "success"
		Assert.assertTrue(resp.getStatusCode()==HttpStatus.SC_OK,"*****Test Failed****** Status Code is "+resp.statusCode()+" "+resp.getBody().asString());
        Assert.assertTrue(resp.body().asString().contains("\"success\": true"),"Invalid response"+resp.body().asString());
    }

	/**
	 * This test Supports adding Jokers with a POST method
	 */
	@Test
	public void CreateDeckofcardsTC002() throws Exception {
		log.info("***** Post Call CreateDeckofcardsTC002 Initiating *********");
		Response resp;
        this.baseUrl = this.contentroot + this.endpoint;
		System.out.println(this.baseUrl);
		resp = CreateAPI.createwithJokerAPI(this.baseUrl, this.payload);
		log.info("***** Post Call CreateDeckofcardsTC002 ended *********");
		log.info(HttpStatus.SC_OK);
		log.info(resp.getStatusCode());
		Assert.assertTrue(resp.getStatusCode()==HttpStatus.SC_OK,"*****Test Failed****** Status Code is "+resp.statusCode()+" "+resp.getBody().asString());
	}
}
