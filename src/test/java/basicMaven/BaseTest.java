package basicMaven;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Run BEFORE every thing");
	}
	
	@BeforeTest
	public void testBefore() {
		System.out.println("Run BEFORE Base test");
	}
	
	@Parameters({"URL", "userName"})
	@Test(groups = {"unitTest"})
	public void testFive(String url, String uname) {
		System.out.println("testFive");
		System.out.println("THis is the URL for the test 1 block" + url);
		System.out.println("THis is the userName for the test 1 block" + uname);
//		Assert.assertTrue(false);
		log.error("This test has failed");
	}
	
	
//	@Parameters({"URL", "userName"})
	@Test(dataProvider= "dataProvider")
	public void testSix(String userN, String Psswd) {
		System.out.println("testSix");
//		System.out.println("THis is the URL for the test 1 block" + url);
//		System.out.println("THis is the userName for the test 1 block" + uname);
		log.info("Test Passed");
		System.out.println("The Username is: " + userN);
		System.out.println("The Pwd is: " + Psswd);
	}
	
	
	@Test(dataProvider= "dataProvider")
	public void testSeven(String uname, String pwd) {
		System.out.println("testSeven");
		System.out.println("The Username is: " + uname);
		System.out.println("The Pwd is: " + pwd);
		log.debug("data Provider params retrieved");
	}
	
	@AfterTest
	public void testAfter( ) {
		System.out.println("Run AFTER Base test");
		log.info("Running after the Base Test Class");
	}
	
	@AfterSuite
	public void testAfterSuite( ) {
		System.out.println("Run AFTER Base test Suite");
		log.info("THis block ran after the entire test suite");
	}
	
	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Uname-One";
		data[0][0] = "Pword-One";
		data[1][0] = "Uname-Two";
		data[1][1] = "Pword-Two";
		data[2][0] = "Uname-Three";
		data[2][1] = "Pword-Three";
		return data;
	}

}
