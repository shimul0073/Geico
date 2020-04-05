package ins.geico.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.management.Utilities;
import junit.framework.Assert;

public class DOB {

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
		Utilities.sendKey(dat, "25");
		Utilities.sendKey(yer, "1981");
		Utilities.clickButton(nxt);
	}

}
