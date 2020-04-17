package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_StartCode;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class StartCode {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public StartCode(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = (OR_StartCode.OR_STARTCODE_ZIPCODE_TEXTBOX ))
	WebElement zipcode;
	@FindBy(xpath = (OR_StartCode.OR_ACCEPT_COOKIES_BUTTON))
	WebElement acceptCookies;
	@FindBy(xpath = (OR_StartCode.OR_BEGIN_QUOTE_BUTTON))
	WebElement clickCode;
	
	@FindBy(xpath = ("//*[@id=\"bundleSave\"]"))
	WebElement bundle;

	public void startCode() {
        
		
		Utilities.sendKey(log,zipcode, "22041", OR_StartCode.S_STARTCODE_ZIPCODE_TEXTBOX);
		Utilities.clickButton(log,acceptCookies,OR_StartCode.S_ACCEPT_COOKIES_BUTTON);
		Utilities.clickButton(log, clickCode, OR_StartCode.S_BEGIN_QUOTE_BUTTON);

	}
}
