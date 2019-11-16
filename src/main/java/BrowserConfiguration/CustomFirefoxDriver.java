package BrowserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomFirefoxDriver{
		
	public  WebDriver LaunchFireFoxDriver(WebDriver webDriver){
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\pandes15\\Documents\\Selenium\\com.cucumber.di\\src\\main\\resources\\com\\cucumber\\di\\driver\\geckodriver.exe");
		 webDriver = new FirefoxDriver();
		return webDriver;
		
}
}
