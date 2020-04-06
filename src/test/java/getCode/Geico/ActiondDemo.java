package getCode.Geico;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ins.geico.management.Utilities;
import ins.geico.management.Wait;
import ins.geico.resources.base;

public class ActiondDemo extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initilized");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to home page");
	}

	@Test
	public void information() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("//html//body//header//div//ul//li//a[contains(text(),'Insurance')]")).click();
		WebElement move = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
		Wait.explicitWaitVisibility(driver, move);
		Utilities.mouseOver(driver, move);

		// Actions action = new Actions(driver);
		// action.moveToElement(move).build().perform();

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		// driver.close();
	}

}
