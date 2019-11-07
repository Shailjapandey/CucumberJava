package BrowserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver {

	public WebDriver LaunchChromeDriver(WebDriver webDriver ,String webpage) {
	System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\pandes15\\Documents\\Selenium\\cucumbertest\\src\\main\\java\\BrowserDriver\\chromedriver.exe");
	webDriver = new ChromeDriver();
	webDriver.get(webpage);
	webDriver.manage().deleteAllCookies();
	webDriver.manage().window().maximize();
	return webDriver;
	}
}
