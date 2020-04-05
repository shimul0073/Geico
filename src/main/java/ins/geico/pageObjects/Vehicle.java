package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class Vehicle {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public Vehicle(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="vehicleYear")
	WebElement selt_year;
	
	@FindBy(xpath="//div[8]//div[1]//div[3]//div[1]//select[1]")
	WebElement veh_make;
	
	@FindBy(xpath="//div[14]//div[1]//div[3]//div[1]//select[1]")
	WebElement veh_model;
	
	@FindBy(xpath="//html//body//div//section//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//div//div//div//div//button[contains(text(),'Next')]")
	WebElement nxtbutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement ownr;
	
	@FindBy(xpath="//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//label[1]")
	WebElement use;
	
	
	public void VehicleType() throws InterruptedException {
		
		Thread.sleep(5000);
		log.info("Selecting car year");
		Utilities.selectDropdown(selt_year, "2015");
		log.info("Selecting car Make");
		Utilities.selectDropdown(veh_make, "BMW");
		log.info("Selecting car Model");
		Utilities.selectDropdown(veh_model, "328D");
		Thread.sleep(5000);
		Utilities.clickButton(nxtbutton);
		Utilities.clickButton(ownr);
		Thread.sleep(5000);
		Utilities.clickButton(use);
	}
}

