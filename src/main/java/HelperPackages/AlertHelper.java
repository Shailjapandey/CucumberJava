package HelperPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHelper {
	

	private static AlertHelper alertHelper ;
	private static WebDriver webdriver;
	
	private AlertHelper(WebDriver driver) {
		webdriver = driver;
	}
    public static AlertHelper getInstance(WebDriver driver)
	{
		if(alertHelper==null || webdriver.hashCode() != driver.hashCode())
			alertHelper = new AlertHelper(driver);
		return alertHelper;
	}
    
    
    private WebDriverWait getWait()
    {
    	WebDriverWait wait = new WebDriverWait(webdriver, 60);
    	wait.pollingEvery(250, TimeUnit.MILLISECONDS);
    	wait.ignoring(NoAlertPresentException.class);
    	return wait;
     }
    
  
    
    public void acceptAlert()
    {
    	Alert alert = waitForAlert();
    	alert.accept();
    }

    private Alert waitForAlert() {
		WebDriverWait wait = getWait();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
    
    public void dismissAlert()
    {
    	Alert alert = waitForAlert();
    	alert.dismiss();
    }
    
    public void setAlertTest(String args){
		Alert alert = waitForAlert();
		alert.sendKeys(args);
		alert.accept();
	}
}
