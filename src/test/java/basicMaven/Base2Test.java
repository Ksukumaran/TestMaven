package basicMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base2Test {
	public WebDriver driver = null;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	@Test
	public void testOne() {
		System.out.println("testOne");
		log.debug("Basic run of TestOne block");
	}
	
	@Parameters({"URL"})
	@Test(groups= {"unitTest"})
	public void testTwo(String url) {
		System.out.println("testTwo");
		System.out.println("This is the URL for the Test Block 2" + url);
		log.info("URL retrieved from xml params " + url);
	}
		
	@Test(enabled=false)
	public void Login() throws IOException {
		 Properties prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Selenium\\selenium-workspace\\testMaven\\src\\test\\java\\basicMaven\\datadriver.properties");
		 prop.load(fis);
		 System.out.println(prop.getProperty("username"));
		 if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
			 driver=new ChromeDriver();
		 } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.firefox.driver","C:\\Software\\geckodriver.exe");
			 driver = new FirefoxDriver();
		 } else {
			 driver = new InternetExplorerDriver();
		 }
		 driver.get(prop.getProperty("url"));
		 System.out.println(prop.getProperty("url"));
	}

}
