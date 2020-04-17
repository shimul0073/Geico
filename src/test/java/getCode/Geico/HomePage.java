package getCode.Geico;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ins.geico.pageObjects.Address;
import ins.geico.pageObjects.AutoType;
import ins.geico.pageObjects.Commute;
import ins.geico.pageObjects.DOB;
import ins.geico.pageObjects.Name;
import ins.geico.pageObjects.StartCode;
import ins.geico.pageObjects.Vehicle;
import ins.geico.resources.base;


public class HomePage extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest

	public void initialize() throws IOException {
		
		driver = initializeDriver();
	    log.info("Driver is initilized");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to home page");
	}

	@Test
	public void getCode() throws InterruptedException {
		
	
	    StartCode startcode= new StartCode(driver);
		startcode.startCode();
		
	    AutoType autoType = new AutoType(driver);
		autoType.autoChoice();
		
		DOB dob = new DOB(driver);
		dob.dateOfBirth();
		
		Name name = new Name(driver);
		name.NameMethod();

		Address address = new Address(driver);
		address.Add();
		
		Vehicle vehicle= new Vehicle(driver);
		vehicle.VehicleType();
		

		Commute commute = new Commute(driver);
		commute.commuteType();
		
	}

	@AfterTest
	public void teardown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}

}
