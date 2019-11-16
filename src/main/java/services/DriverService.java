package services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import BrowserConfiguration.CustomChromeDriver;
import HelperPackages.*;

public class DriverService {
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public CustomChromeDriver getCustomChromeDriver() {
		return customChromeDriver;
	}

	public ButtonHelper getButtonHelper() {
		return buttonHelper;
	}

	public WindowHelper getWindowHelper() {
		return windowHelper;
	}

	public AlertHelper getAlertHelper() {
		return alertHelper;
	}

	private WebDriver driver;
	private CustomChromeDriver customChromeDriver;
	private ButtonHelper buttonHelper;
	private WindowHelper windowHelper;
	private AlertHelper alertHelper;
	
		
	
	public void launchBrowser()
	{
		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.LaunchChromeDriver(driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MILLISECONDS);
		
		
		buttonHelper = ButtonHelper.getInstance(driver);
		alertHelper = AlertHelper.getInstance(driver);
		
	}
	
	public DriverService() {
		launchBrowser();
	}
	
	
	

	
}
