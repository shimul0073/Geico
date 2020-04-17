package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_AutoType;
import ins.geico.management.Utilities;
import ins.geico.management.Wait;
import ins.geico.resources.base;

public class AutoType {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public AutoType(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = (OR_AutoType.OR_AUTOTYPE_NEEDINSURANCE_BUTTON))
	WebElement needInsurance;
	@FindBy(xpath = (OR_AutoType.OR_AUTOTYPE_BEGINQUOTE_BUTTON))
	WebElement beginQuote;
	@FindBy(xpath = (OR_AutoType.OR_AUTOTYPE_NEXT_BUTTON))
	WebElement nextButton;

		public void autoChoice() throws InterruptedException {
        Thread.sleep(5000);
		Wait.explicitWaitVisibility(driver, needInsurance);
		Utilities.clickButton(log, needInsurance, OR_AutoType.S_AUTOTYPE_NEEDINSURANCE_BUTTON);
		Utilities.clickButton(log, beginQuote, OR_AutoType.S_AUTOTYPE_BEGINQUOTE_BUTTON);
		Wait.explicitWaitVisibility(driver, nextButton);
		Thread.sleep(5000);
		Utilities.clickButton(log, nextButton, OR_AutoType.S_AUTOTYPE_NEXT_BUTTON);
		Thread.sleep(5000);
		
	}
}