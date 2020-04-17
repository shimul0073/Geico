package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_DOB;
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
	
	@FindBy (xpath=OR_DOB.OR_DOB_MON_TEXTBOX)
	WebElement mon;
	@FindBy (xpath=OR_DOB.OR_DOB_DATE_TEXTBOX)
	WebElement dat;
	@FindBy (xpath=OR_DOB.OR_DOB_YEAR_TEXTBOX)
	WebElement yer;
	@FindBy (xpath=OR_DOB.OR_DOB_NEXT_BUTTON)
	WebElement nxt;
	
	public void dateOfBirth() {
		
		Utilities.AssertionTitle(driver.getCurrentUrl(), "https://auto-buy.geico.com/nb#/sale/customerinformation/gskmsi?brkq=1");
		Utilities.sendKey(log, mon, "5", OR_DOB.S_DOB_MON_TEXTBOX);
		Utilities.sendKey(log, dat, "6", OR_DOB.S_DOB_DATE_TEXTBOX);
		Utilities.sendKey(log, yer, "1980", OR_DOB.OR_DOB_YEAR_TEXTBOX);
		Utilities.clickButton(log, nxt, OR_DOB.S_DOB_NEXT_BUTTON);
		
	}

}
