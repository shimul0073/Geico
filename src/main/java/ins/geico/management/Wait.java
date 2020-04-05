package ins.geico.management;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	
	public static void explicitWaitVisibility(WebDriver driver,WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void explicitWaitInvisisbility(WebDriver driver,WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOf(element));
		
	}

}
