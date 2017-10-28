package generic;

import java.io.IOException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasePage implements AutoConst 
{
	public static WebDriver driver;
	
	@Parameters({"browser","nodeurl","appurl"})
	@BeforeMethod 
	public void precondition(String browser, String nodeurl, String appurl) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		URL url=new URL(nodeurl);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		RemoteWebDriver d=new RemoteWebDriver(url, dc);
		d.get(appurl);
		
//		if(browser.equals("firefox"))
//		{
//			URL node = new URL("http://169.254.134.220:4444/wd/hub/");
//			DesiredCapabilities dc = new DesiredCapabilities();
//			RemoteWebDriver driver = new RemoteWebDriver();
//			System.setProperty(GECKO_KEY, GECKO_VALUE);
//			FirefoxProfile f = new FirefoxProfile();
//			f.setPreference("dom.webnotifications.enabled", false);
//			driver  = new FirefoxDriver(f);
//		}
//		else if(browser.equals("chrome"))
//		{
//			System.setProperty(CHROME_KEY, CHROME_VALUE);
//			driver= new ChromeDriver();
//		}
			
			
			
			driver.manage().window().maximize();
			Reporter.log("Before method" , true);
			driver.get(Excel.readData("Sheet1", 2, 1));
//			driver.get("http://www.google.co.in");
		
	}
	
//	@AfterMethod
//	public void postcondition()
//	{
//		driver.close();
//	}
}
