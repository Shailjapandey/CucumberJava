package HelperPackages;

import org.openqa.selenium.WebDriver;

public class BrowserHelperClass {
	
	private static BrowserHelperClass browserHelperClass;
	private WebDriver driver;
	private ButtonHelper btnHelper;
	
	
	private BrowserHelperClass(WebDriver driver){
		this.driver = driver;
	
	}

	public static BrowserHelperClass getInstance(WebDriver driver)
	{
		if(browserHelperClass == null)
			browserHelperClass = new BrowserHelperClass(driver);
		
		return browserHelperClass;
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	public void moveForward()
	{
		driver.navigate().forward();
	}
	
	public void moveBackword()
	{
		driver.navigate().back();
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
}
