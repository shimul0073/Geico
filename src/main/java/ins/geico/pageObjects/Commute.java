package ins.geico.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ins.geico.management.Utilities;

public class Commute {
	public WebDriver driver;
	public Commute(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "daysDriven")
	WebElement days;

	@FindBy(id = "milesDriven")
	WebElement miles;

	@FindBy(xpath = "//html//body//div//section//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//div//div//div//div//button[contains(text(),'Next')]")
	WebElement nxtbutton;

	@FindBy(xpath = "/html/body/div[3]/section/div/div[1]/div/div[1]/div[1]/div[1]/form/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/button")
	WebElement ntbutton;


	
	public void commuteType() {
		Utilities.selectDropdown(days, "5");
		Utilities.sendKey(miles, "15");
		Utilities.clickButton(nxtbutton);
		//Utilities.clickButton(ntbutton);
	}
	

}
