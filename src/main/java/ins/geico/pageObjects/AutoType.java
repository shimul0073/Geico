package ins.geico.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.management.Utilities;
import ins.geico.management.Wait;

public class AutoType {
	public WebDriver driver;
	public AutoType(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//body/div/section/div/div/div/div/div/div/div/div/div/div/div/div[3]/label[1]"))
	WebElement needInsurance;

	@FindBy(xpath = ("//button[contains(text(),'Begin Quote')]"))
	WebElement beginQuote;
	@FindBy(xpath = ("//button[contains(text(),'Next')]"))
	WebElement nextButton;

		public void autoChoice() throws InterruptedException {
        Thread.sleep(5000);
		Wait.explicitWaitVisibility(driver, needInsurance);
		Utilities.clickButton(needInsurance);
		Utilities.clickButton(beginQuote);
		Wait.explicitWaitVisibility(driver, nextButton);
		Thread.sleep(5000);
		Utilities.clickButton(nextButton);
		Thread.sleep(5000);
		
	}
}