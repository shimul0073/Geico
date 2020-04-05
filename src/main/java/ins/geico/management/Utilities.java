package ins.geico.management;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Utilities {

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void sendKey(WebElement element, String inputText) {
		element.clear();
		element.sendKeys(inputText);
	}

	public static String getTxt(WebElement element) {
		return element.getText();

	}

	public static void selectDropdown(WebElement element, String inputText) {

		Select select = new Select(element);
		select.selectByVisibleText(inputText);

	}
	
	public static void AssertionTitle(String element, String title) {
		Assert.assertEquals(element, title);
	}

}
