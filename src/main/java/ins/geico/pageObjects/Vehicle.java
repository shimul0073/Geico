package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ins.geico.ObjectRepository.OR_Vehicle;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class Vehicle {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public Vehicle(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name=OR_Vehicle.OR_VEHICLE_SELECTYEAR_TEXTBOX)
	WebElement selt_year;
	
	@FindBy(xpath=OR_Vehicle.OR_VEHICLE_SELECTMAKE_TEXTBOX)
	WebElement veh_make;
	
	@FindBy(xpath=OR_Vehicle.OR_VEHICLE_SELECTMODEL_TEXTBOX)
	WebElement veh_model;
	
	@FindBy(xpath=(OR_Vehicle.OR_VEHICLE_NEXT_BUTTON))
	WebElement nxtbutton;
	
	@FindBy(xpath=(OR_Vehicle.OR_VEHICLE_OWNER_BUTTON))
	WebElement ownr;
	
	@FindBy(xpath=(OR_Vehicle.OR_VEHICLE_USE_BUTTON))
	WebElement use;
	
	
	public void VehicleType() throws InterruptedException {
		
		Thread.sleep(5000);
		Utilities.selectDropdown(log, selt_year, "2016", OR_Vehicle.S_VEHICLE_SELECTYEAR_TEXTBOX);		
		Utilities.selectDropdown(log, veh_make, "BMW", OR_Vehicle.S_VEHICLE_SELECTMAKE_TEXTBOX);	
		Utilities.selectDropdown(log, veh_model, "328D", OR_Vehicle.S_SELECTMODEL_TEXTBOX);
		Thread.sleep(5000);
		Utilities.clickButton(log, nxtbutton, OR_Vehicle.S_VEHICLE_NEXT_BUTTON);
		Utilities.clickButton(log, ownr, OR_Vehicle.S_VEHICLE_OWNER_BUTTON);
		Thread.sleep(5000);
		Utilities.clickButton(log, use, OR_Vehicle.S_VEHICLE_USE_BUTTON);
	}
}

