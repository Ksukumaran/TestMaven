package basicMaven;

import org.testng.annotations.Test;

public class Base2Test {
	
	@Test
	public void testOne() {
		System.out.println("testOne");
	}
	
	@Test(groups= {"unitTest"})
	public void testTwo() {
		System.out.println("testTwo");
	}

}
