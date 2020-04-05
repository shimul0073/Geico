package ins.geico.pageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.management.DataDriven;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class AccessPolicy {
	
		public static Logger log=LogManager.getLogger(base.class.getName());
		public WebDriver driver;
		public AccessPolicy(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//body/div/div/div/div/div/div/div/div/form/div/button[1]")
		WebElement log_in;
		@FindBy(xpath = "//asd-text-input[1]//asd-input-container[1]//div[1]//input[1]")
		WebElement userId;
		@FindBy(xpath="//asd-text-input[2]//asd-input-container[1]//div[1]//input[1]")
		WebElement password;
		@FindBy(xpath="//button[contains(text(),'Login')]")
		WebElement login;
		

		public void policyAccess() throws InterruptedException, IOException {
			
			DataDriven d= new DataDriven();
			ArrayList data=d.getData("HomePageLogin");
		
			
			log.info("Case 2 is Running");
			Utilities.clickButton(log_in);
//			for(int i=0;i<=3;i++) {
			log.info("User is sending UserId");
			Utilities.sendKey(userId, data.get(1).toString());
			log.info("User is sending password");
			Utilities.sendKey(password, data.get(2).toString());
			Utilities.clickButton(login);
//			}

		}

}
