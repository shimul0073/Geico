package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ins.geico.ObjectRepository.OR_Commute;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class Commute {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public Commute(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = OR_Commute.OR_COMMUTE_DAYS_TEXTBOX)
	WebElement days;

	@FindBy(id = OR_Commute.OR_COMMUTE_MILES_TEXTBOX)
	WebElement miles;

	@FindBy(xpath =OR_Commute.OR_COMMUTE_MILESNEXT_BUTTON )
	WebElement nxtbutton;

	@FindBy(xpath = OR_Commute.OR_COMMUTE_NEXT_BUTTON )
	WebElement ntbutton;


	
	public void commuteType() {
		
		Utilities.selectDropdown(log, days, "5", OR_Commute.S_COMMUTE_DAYS_TEXTBOX);
		Utilities.sendKey(log, miles, "20", OR_Commute.S_COMMUTE_MILES_TEXTBOX);
		Utilities.clickButton(log, nxtbutton , OR_Commute.S_COMMUTE_MILESNEXT_BUTTON);
		Utilities.clickButton(log,ntbutton,OR_Commute.S_COMMUTE_NEXT_BUTTON);
	}
	

}
