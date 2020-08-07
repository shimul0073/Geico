package getCode.Geico;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ins.geico.pageObjects.AccessPolicy;
import ins.geico.resources.base;

public class HomePageLogIn extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initilized");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to home page");
	}
// this is test 
	@Test
	public void getCode() throws InterruptedException, IOException {

		AccessPolicy accesspolicy = new AccessPolicy(driver);
		accesspolicy.policyAccess();

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
