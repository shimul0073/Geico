package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.management.Utilities;
import ins.geico.resources.base;
import junit.framework.Assert;

public class DOB {
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public DOB(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//body//div//form//input[1]")
	WebElement mon;
	@FindBy (xpath="//body//div//form//input[2]")
	WebElement dat;
	@FindBy (xpath="//body//div//form//input[3]")
	WebElement yer;
	@FindBy (xpath="//html//body//div//section//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//div//div//div//div//button[contains(text(),'Next')]")
	WebElement nxt;
	
	public void dateOfBirth() {
		
		Utilities.AssertionTitle(driver.getCurrentUrl(), "https://auto-buy.geico.com/nb#/sale/customerinformation/gskmsi?brkq=1");
		Utilities.sendKey(mon, "10");
		log.info("User is giving birth month");
		Utilities.sendKey(dat, "25");
		log.info("User is giving birth month");
		Utilities.sendKey(yer, "1981");
		log.info("User is sending birth year");
		Utilities.clickButton(nxt);
		
	}

}
