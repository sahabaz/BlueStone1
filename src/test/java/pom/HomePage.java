package pom;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel;

public class HomePage extends BaseTest
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[.='Log In']")
	private WebElement loginLink;
	
	public WebElement loginLink()
	{
		return loginLink;
	}
	
	@FindBy(xpath="//input[@id='email-id']")
	private WebElement usrNameTxtFld;
	
	public WebElement usrNameTxtFld()
	{
		return usrNameTxtFld;
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pswdTxtFld;
	
	public WebElement pswdTxtFld()
	{
		return pswdTxtFld;
	}
	
	
	@FindBy(xpath="//input[@id='edit-login-account']")
	private WebElement logInBtn;
	
	public WebElement logInBtn()
	{
		return logInBtn;
	}
	
	@FindBy(xpath="//span[.='Rings ']")
	private WebElement selectRings;
	
	public WebElement selectRings()
	{
		return selectRings;
	}
	
	@FindBy(xpath="(//span[.=' For Men '])[1]")
	private WebElement forMen;
	
	public WebElement forMen()
	{
		return forMen;
	}
	
	@FindBy(xpath="(//a[@id='pid_2785'])[2]/../../..")
	private WebElement ringSelect;
	
	public WebElement ringSelect()
	{
		return ringSelect;
	}
	
	@FindBy(xpath="//select[@id='ringselect']")
	private WebElement selectSize;
	
	public WebElement selectSize()
	{
		return selectSize;
	}
	
	@FindBy(xpath="//a[@id='homeTryOnProductButton']")
	private WebElement tryAtHome;
	
	public WebElement tryAtHome()
	{
		return tryAtHome;
	}
	
	@FindBy(xpath="//input[@id='try_phone_pd']")
	private WebElement phNo;
	
	public WebElement phNo()
	{
		return phNo;
	}
	
	@FindBy(xpath="(//input[@id='name_pd'])[1]")
	private WebElement bringItHome;
	
	public WebElement bringItHome()
	{
		return bringItHome;
	}
	
	@FindBy(xpath="//input[@id='try_pin_pd']")
	private WebElement pinCode;
	
	public WebElement pinCode()
	{
		return pinCode;
	}
	
	@FindBy(xpath="//textarea[@id='try_address_pd']")
	private WebElement fullAddress;
	
	public WebElement fullAddress()
	{
		return fullAddress;
	}
	
	@FindBy(xpath="(//input[@id='name_pd'])[2]")
	private WebElement doneBtn;
	
	public WebElement doneBtn()
	{
		return doneBtn;
	}
	
	@FindBy(xpath="//div[@class='fancybox-close hto-skip']")
	private WebElement cancelBtn;
	
	public WebElement cancelBtn()
	{
		return cancelBtn;
	}
	
	@FindBy(xpath="//h2[contains(.,'Thank you')]")
	private WebElement ThanksMsg;
	
	public WebElement ThanksMsg()
	{
		return ThanksMsg;
	}
	
	@FindBy(xpath="//a[@title='Close']")
	private WebElement closeBtn1;
	
	public WebElement closeBtn1()
	{
		return closeBtn1;
	}
	
	@FindBy(xpath="//span[@class='view-by-wrap title style-outline i-right']")
	private WebElement sortBy;
	
	public WebElement sortBy()
	{
		return sortBy;
	}
	
	@FindBy(xpath="//a[.='Price Low to High ']")
	private WebElement lowToHigh;
	
	public WebElement lowToHigh()
	{
		return lowToHigh;
	}
	
	@FindBy(xpath="//span[@class='p-wrap']")
	private List<WebElement> price;
	
	public List<WebElement> price()
	{
		return price;
	}
	
	@FindBy(xpath="(//span[@class='title style-fill i-right'])[1]")
	private WebElement priceBtn;
	
	public WebElement priceBtn()
	{
		return priceBtn;
	}
	
	@FindBy(xpath="//a[@data-displayname='rs 10000 to rs 20000']")
	private WebElement sortByPrice;
	
	public WebElement sortByPrice()
	{
		return sortByPrice;
	}
	
	@FindBy(xpath="//span[.='Metal']/..")
	private WebElement metalDrpDwn;
	
	public WebElement metalDrpDwn()
	{
		return metalDrpDwn;
	}
	
	@FindBy(xpath="//i[@class='close icon-ion-android-close']")
	private WebElement closeMetal;
	
	public WebElement closeMetal()
	{
		return closeMetal;
	}
	
	@FindBy(xpath="//a[@data-displayname='white gold']")
	private WebElement sortByMetal;
	
	public WebElement sortByMetal()
	{
		return sortByMetal;
	}
	
	public void logIn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		loginLink().click();
		Thread.sleep(1000);
		usrNameTxtFld().sendKeys(Excel.readData("Sheet1", 0, 1));
		pswdTxtFld().sendKeys(Excel.readData("Sheet1", 1, 1));
		logInBtn().click();
	}
}
