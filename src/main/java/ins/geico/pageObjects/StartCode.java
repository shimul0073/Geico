package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class StartCode {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public StartCode(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//div//div//div//div//div//div//div[3]//div[1]//input[1]"))
	WebElement zipcode;
	@FindBy(xpath = ("//*[@id=\'cookie-notice-close\']"))
	WebElement acceptCookies;
	@FindBy(xpath = ("//button[contains(text(),'Start Quote')]"))
	WebElement clickCode;

	public void startCode() {
        
		log.info("Entering Zip Code");
		Utilities.sendKey(zipcode, "22041");
		log.info("Accepting cookies");
		Utilities.clickButton(acceptCookies);
		Utilities.clickButton(clickCode);

	}
}
