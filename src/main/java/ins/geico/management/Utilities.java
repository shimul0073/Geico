package ins.geico.management;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Utilities {

	public static void clickButton(Logger log, WebElement element, String ButtonName) {
		element.click();
		log.info(ButtonName + " Clicked");
	}

	public static void sendKey(Logger log,WebElement element, String inputText,String TextBoxName) {
		element.clear();
		element.sendKeys(inputText);
		log.info("Input Text Sent to "+ TextBoxName + " Successfully");
	}

	public static void getTxt(WebElement element) {
		element.getText();

	}

	public static void selectDropdown(Logger log,WebElement element, String inputText, String Item) {

		Select select = new Select(element);
		select.selectByVisibleText(inputText);
		log.info(Item + " Selected Successfully");
	}

	public static void AssertionTitle(String element, String title) {
		Assert.assertEquals(element, title);
	}

	public static void mouseOver(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();;

	}

	public static void Click(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.click(element).build().perform();;

	}
	
	public static void RightClick(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();

	}
}
