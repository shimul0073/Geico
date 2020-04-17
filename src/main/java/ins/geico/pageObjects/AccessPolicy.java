package ins.geico.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.geico.ObjectRepository.OR_AccessPolicy;
import ins.geico.management.Utilities;
import ins.geico.resources.base;

public class AccessPolicy {
	
		public static Logger log=LogManager.getLogger(base.class.getName());
		public WebDriver driver;
		public AccessPolicy(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = (OR_AccessPolicy.OR_ACCESSPOLICY_LOGIN_BUTTON))
		WebElement log_in;
		@FindBy(xpath = (OR_AccessPolicy.OR_ACCESSPOLICY_USERID_TEXTBOX))
		WebElement userId;
		@FindBy(xpath=(OR_AccessPolicy.OR_ACCESSPOLICY_PASSWORD_TEXTBOX))
		WebElement password;
		@FindBy(xpath=(OR_AccessPolicy.OR_ACCESSPOLICY_LOGINHOMEPAGE_BUTTON))
		WebElement login;
		

		public void policyAccess() {
			
//			DataDriven d= new DataDriven();
//			ArrayList data=d.getData("HomePageLogin");
//			Utilities.sendKey(userId, data.get(1).toString());
//			Utilities.sendKey(password, data.get(2).toString());
//			Utilities.clickButton(login);
			
			
	Utilities.clickButton(log, log_in, OR_AccessPolicy.S_ACCESSPOLICY_LOGIN_BUTTON);
	Utilities.sendKey(log, userId, "shimul00shimul@gmail.com", OR_AccessPolicy.S_ACCESSPOLICY_USERID_TEXTBOX);
	Utilities.sendKey(log, password, "shimul50005", OR_AccessPolicy.S_ACCESSPOLICY_PASSWORD_TEXTBOX);
    Utilities.clickButton(log, login, OR_AccessPolicy.S_ACCESSPOLICY_LOGINHOMEPAGE_BUTTON);
			
			
			
			
		
		}

		}

