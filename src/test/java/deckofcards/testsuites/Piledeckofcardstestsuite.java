/**
 * @author Jigisha Shah
 * @version 1.0
 */
package deckofcards.testsuites;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class Piledeckofcardstestsuite {
	public static Logger log = Logger.getLogger(Piledeckofcardstestsuite.class);
	@BeforeClass(alwaysRun = true)
	public void beforeClass(ITestContext context) throws Exception {

	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(ITestContext context, Method testMethod) throws Exception{
		Thread.sleep(200);
		log.info("*******************************************************************************************************");
		log.info("                                       "+testMethod.getName());
		log.info("*******************************************************************************************************");
	}
	/**
	 * This test verifies xxxxxx
	 */
	@Test
	public void PileDeckofcardsTC001() throws Exception {

	}

}
