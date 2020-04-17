package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_Address;
import ins.geico.management.Utilities;
import ins.geico.management.Wait;
import ins.geico.resources.base;

public class Address {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public Address(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = OR_Address.OR_ADDRESS_ADD_TEXTBOX )
	WebElement add;
	@FindBy(xpath = OR_Address.OR_ADDRESS_NEXT_BUTTON )
	WebElement nxtbutton;
	@FindBy(xpath=OR_Address.OR_ADDRESS_NO_BUTTON)
	WebElement clickNo;

	public void Add() throws InterruptedException {
		
		//Wait.explicitWaitVisibility(driver, add);
		Utilities.sendKey(log, add, " 3380 Ardley court Falls Church VA", OR_Address.S_ADDRESS_ADD_TEXTBOX);
		Thread.sleep(5000);
		Utilities.clickButton(log, nxtbutton, OR_Address.S_ADDRESS_NEXT_BUTTON);
		Thread.sleep(15000);
		Utilities.clickButton(log, clickNo, OR_Address.S_ADDRESS_NO_BUTTON);
		
	}

}
