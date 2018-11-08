package basicMaven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base2Test {
	
	@Test
	public void testOne() {
		System.out.println("testOne");
	}
	
	@Parameters({"URL"})
	@Test(groups= {"unitTest"})
	public void testTwo(String url) {
		System.out.println("testTwo");
		System.out.println("This is the URL for the Test Block 2" + url);
	}

}
