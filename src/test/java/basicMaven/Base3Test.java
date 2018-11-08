package basicMaven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base3Test {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This runs before every method in Base3Test");
	}
	
	@Test(groups= {"unitTest"})
	public void testThree() {
		System.out.println("testThree - Base3Test");
	}
	
	@Test
	public void testFour() {
		System.out.println("testFour - Base3Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This runs before after method in Base3Test");
	}

}
