package HelperPackages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotHelper {
	
	
	private static ScreenShotHelper screenShotHelper;
	private static WebDriver wbDriver;
	
	private ScreenShotHelper(WebDriver driver)
	{
		wbDriver = driver;
	}

	public static ScreenShotHelper getInstance(WebDriver driver)
	{
		
		if(screenShotHelper == null || wbDriver.hashCode() != driver.hashCode())
			screenShotHelper = new ScreenShotHelper(driver);
	         return screenShotHelper;	
	}

	public void takeScreenShot(String filename, String location) throws IOException
	{
		File dir =new File(location);
		
		if(!dir.exists())
			dir.mkdir();
		File screenshot =  ((TakesScreenshot)wbDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(dir.getAbsoluteFile()+File.separator + filename));
		
		
	}
}
