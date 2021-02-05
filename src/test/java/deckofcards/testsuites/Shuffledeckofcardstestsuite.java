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

public class Shuffledeckofcardstestsuite {
	public static Logger log = Logger.getLogger(Shuffledeckofcardstestsuite.class);
	@BeforeClass(alwaysRun = true)
	public void beforeClass(ITestContext context) throws Exception {

	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(ITestContext context, Method testMethod) throws Exception{
		Thread.sleep(200);
		System.out.println("*******************************************************************************************************");
		System.out.println("                                       "+testMethod.getName());
		System.out.println("*******************************************************************************************************");
	}
	/**
	 * This test verifies xxxxxx
	 */
	@Test
	public void ShuffleDeckofcardsTC001() throws Exception {

	}

}
