package ins.geico.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.management.Utilities;
import ins.geico.management.Wait;

public class Address {
	public WebDriver driver;

	public Address(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[2]//div[1]//div[2]//div[1]//input[1]")
	WebElement add;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
	WebElement nxtbutton;
	@FindBy(xpath="/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickNo;

	public void Add() throws InterruptedException {
		
		//Wait.explicitWaitVisibility(driver, add);
		Utilities.sendKey(add, "3371 Ardley Court, FallsChurch");
		Thread.sleep(5000);
		Utilities.clickButton(nxtbutton);
		Thread.sleep(15000);
		Utilities.clickButton(clickNo);
		
	}

}
