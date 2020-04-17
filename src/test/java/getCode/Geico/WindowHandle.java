package getCode.Geico;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ins.geico.resources.base;

public class WindowHandle extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initilized");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to home page");
	}

	@Test
	                         public void handleWindow()  {
		driver.findElement(By.xpath("//*[@id=\'cookie-notice-close\']")).click();
		driver.findElement(By.xpath("//footer//div[2]//ul[1]//li[1]//a[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Set <String > ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());	
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		// driver.close();
	}

}
