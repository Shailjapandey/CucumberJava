package HelperPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxHepler {
	
	private static TextBoxHepler textBoxHepler ;
	private static WebDriver webdriver;
	
	private TextBoxHepler(WebDriver driver) {
		webdriver = driver;
	}
    public static TextBoxHepler getInstance(WebDriver driver)
	{
		if(textBoxHepler==null)
			textBoxHepler = new TextBoxHepler(driver);
		return textBoxHepler;
	}

    public void setText(By locator, String value)
    {
    	webdriver.findElement(locator).sendKeys(value);
    }
    
    public String getText(By locator)
    {
    	String value = webdriver.findElement(locator).getText();
    	return value;
    }
    
    public void clear(By locator)
    {
    	webdriver.findElement(locator).clear();
    }
    
}
