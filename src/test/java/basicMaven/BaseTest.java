package basicMaven;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	@BeforeTest
	public void testBefore( ) {
		System.out.println("Run BEFORE every other test");
	}
	
	@Test
	public void testFive() {
		System.out.println("testFive5555");
	}
	
	@Test
	public void testSix() {
		System.out.println("testSix");
	}
	
	@Test
	public void testSeven() {
		System.out.println("testSeven");
	}
	
	@AfterTest
	public void testAfter( ) {
		System.out.println("Run AFTER Base test");
	}

}
