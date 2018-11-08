package basicMaven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Run BEFORE every thing");
	}
	
	@BeforeTest
	public void testBefore() {
		System.out.println("Run BEFORE Base test");
	}
	
	@Parameters({"URL", "userName"})
	@Test
	public void testFive(String url, String uname) {
		System.out.println("testFive");
		System.out.println("THis is the URL for the test 1 block" + url);
		System.out.println("THis is the userName for the test 1 block" + uname);
	}
	
	@Parameters({"URL", "userName"})
	@Test(groups= {"unitTest"})
	public void testSix(String url, String uname) {
		System.out.println("testSix");
		System.out.println("THis is the URL for the test 1 block" + url);
		System.out.println("THis is the userName for the test 1 block" + uname);
	}
	
	@Test
	public void testSeven() {
		System.out.println("testSeven");
	}
	
	@AfterTest
	public void testAfter( ) {
		System.out.println("Run AFTER Base test");
	}
	
	@AfterSuite
	public void testAfterSuite( ) {
		System.out.println("Run AFTER Base test Suite");
	}

}
