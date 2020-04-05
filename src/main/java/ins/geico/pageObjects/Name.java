package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(id = "firstName")
	WebElement fname;

	@FindBy(id = "lastName")
	WebElement laname;

	@FindBy(xpath = "//html//body//div//section//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//div//div//div//div//button[contains(text(),'Next')]")
	WebElement nextbtn;

	public void NameMethod() throws InterruptedException {
		
		log.info("Entering First Name");
		Utilities.sendKey(fname, "Towha");
		log.info("Entering Last Name");
		Utilities.sendKey(laname, "Mona");
		Utilities.clickButton(nextbtn);
		Thread.sleep(5000);
		
		//Wait.explicitWaitInvisisbility(driver, nextbtn);

	}

}
