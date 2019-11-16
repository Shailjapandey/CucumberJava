package generichook;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import services.DriverService;

public class GeneralHook {

	private DriverService service;
	private WebDriver driver;
	
	public GeneralHook(DriverService service)
	{
		this.service = service;
		this.driver = service.getDriver();
	}
	
	@Before
	public void setup()
	{
		
	}
	
	@After
	public void teardown()
	{
		
	}
}

