package HelperPackages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;


public class WindowHelper {
	
	private static WindowHelper windowHelper;
	private static WebDriver wbDriver;
	private ArrayList<String> windowId;
	
	private WindowHelper(WebDriver driver)
	{
		wbDriver = driver;
	}

	public static WindowHelper getInstance(WebDriver driver)
	{
		
		if(windowHelper == null || wbDriver.hashCode() != driver.hashCode())
			windowHelper = new WindowHelper(driver);
	         return windowHelper;	
	}
	
	
	
	private List<String> getWindowId()
	{
		 windowId = new ArrayList<String>(wbDriver.getWindowHandles());
		 return Collections.unmodifiableList(windowId);
	}
	
	public void switchWindow(int index)
	{
		
		ArrayList<String>  windowId = new ArrayList<String>(getWindowId());
		wbDriver.switchTo().window(windowId.get(index));
	}
	

}
