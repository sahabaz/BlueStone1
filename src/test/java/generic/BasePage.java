package generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage implements AutoConst 
{
	public static WebDriver driver;
	
	@BeforeMethod 
	public void precondition() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			FirefoxProfile f = new FirefoxProfile();
			f.setPreference("dom.webnotifications.enabled", false);
			driver  = new FirefoxDriver(f);
			Reporter.log("Before method" , true);
			driver.get(Excel.readData("Sheet1", 2, 1));
//			driver.get("http://www.google.co.in");
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
}
