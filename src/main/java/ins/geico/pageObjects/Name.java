package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_Name;
import ins.geico.management.Utilities;
import ins.geico.management.Wait;
import ins.geico.resources.base;

public class Name {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public Name(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = OR_Name.OR_NAME_FIRSTNAME_TEXTBOX)
	WebElement fname;

	@FindBy(id = OR_Name.OR_NAME_LASTNAME_TEXTBOX )
	WebElement laname;

	@FindBy(xpath = OR_Name.OR_NAME_NEXT_BUTTON )
	WebElement nextbtn;

	public void NameMethod() throws InterruptedException {
		
		
		Utilities.sendKey(log, fname, "Jhon", OR_Name.S_NAME_FIRSTNAME_TEXTBOX);
		Utilities.sendKey(log, laname, "Marshal", OR_Name.S_NAME_LASTNAME_TEXTBOX);
		Utilities.clickButton(log, nextbtn, OR_Name.S_NAME_NEXT_BUTTON);
		Thread.sleep(5000);
		
		//Wait.explicitWaitInvisisbility(driver, nextbtn);

	}

}
