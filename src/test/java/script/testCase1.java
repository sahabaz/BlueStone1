package script;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import generic.genericUtils;
import pom.HomePage;
//@Listeners(generic.Listeners.class)
@Listeners

public class testCase1 extends BasePage
{
	public HomePage h ;
	int n = 0;
	@Test(priority=1)
	void signIn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Reporter.log("test main method" , true);
		h = new HomePage(driver);
		h.logIn();	
		BaseTest.pageVerification(driver.getTitle(), "My Account");
	}
//	
//	@Test(priority=2)
//	void selectingRing() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		h = new HomePage(driver);
//		h.logIn();
//		Thread.sleep(1000);
//		genericUtils.hover(h.selectRings());
//		h.forMen().click();
//		genericUtils.scroll(1500);
//		h.ringSelect().click();
//		Thread.sleep(1000);
//		genericUtils.selectByIndex(h.selectSize(), 7);
//		h.tryAtHome().click();
//		h.phNo().clear();
//		h.phNo().sendKeys(Excel.readData("Sheet1", 3, 1));
//		h.bringItHome().click();
//		h.pinCode().sendKeys(Excel.readData("Sheet1", 4, 1));
//		h.fullAddress().click();
//		h.fullAddress().sendKeys(Excel.readData("Sheet1", 5, 1));
//		h.doneBtn().click();	
//		h.cancelBtn().click();
//		BaseTest.elementVerification(h.ThanksMsg());
//		Thread.sleep(1000);
//		h.closeBtn1().click();
//	}
//	
//	@Test(priority=3)
//	void sorting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		h = new HomePage(driver);
//		h.logIn();
//		Thread.sleep(1000);
//		genericUtils.hover(h.selectRings());
//		h.forMen().click();
//		genericUtils.hover(h.sortBy());
//		Thread.sleep(1000);
//		h.lowToHigh().click();
//		ArrayList<Integer> a = new ArrayList();
//		for(WebElement l : h.price())
//		{
//			String s = l.getText().substring(4,6) + l.getText().substring(7,10);
//			Integer I = new Integer(s);
//			a.add(I);
//		}
//		BaseTest.priceVerification(a);
//		Reporter.log("Products are in sorted order: pass" , true);	
//	}
//	
//	@Test(priority=4)
//	public void discount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		h = new HomePage(driver);
//		h.logIn();
//		Thread.sleep(1000);
//		genericUtils.hover(h.selectRings());
//		h.forMen().click();
//		genericUtils.hover(h.sortBy());
//		Thread.sleep(1000);
//		h.lowToHigh().click();
//		genericUtils.hover(h.priceBtn());
//		Thread.sleep(1000);
//		h.sortByPrice().click();
//		ArrayList<Integer> a = new ArrayList();
//		for(WebElement l : h.price())
//		{
//			String s = l.getText().substring(4,6) + l.getText().substring(7,10);
//			Integer I = new Integer(s);
//			a.add(I);
//		}
//		BaseTest.priceVerification(a);
//		Reporter.log("Products are in sorted order: pass" , true);
//		for(int i =0 ; i<a.size() ; i++)
//		{
//			if(!(a.get(i)>=1000 && a.get(i)<=20000))
//			{
//				Reporter.log("Products are not in the range of 10,000-20,000: fail" , true);
//			}
//		}
//		Reporter.log("Products are in the range of 10,000-20,000: Pass" , true);
//	}
//
//	@Test(priority=5)
//	void metal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		h = new HomePage(driver);
//		h.logIn();
//		Thread.sleep(1000);
//		genericUtils.hover(h.selectRings());
//		h.forMen().click();
//		genericUtils.hover(h.sortBy());
//		Thread.sleep(1000);
//		h.lowToHigh().click();
//		genericUtils.hover(h.metalDrpDwn());
//		Thread.sleep(1000);
//		h.sortByMetal().click();
//		h.closeMetal().click();
//		ArrayList<String> a = new ArrayList();
//		for(WebElement l : h.price())
//		{
//			String s = l.getText().toString();
//			if(s.contains("White Gold"))
//			{
//				a.add(s);
//			}
//
//		}
//		if(h.price().size() == a.size())
//		{
//			Reporter.log("All products are of White Gold metal: pass" , true);
//		}
//		else
//		{
//			Reporter.log("All products are not of White Gold metal: Fail" , true);
//		}
//	}
	
//	@Test
//	void wishlistProductVerification() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
//	{
//		h = new HomePage(driver);
//		h.logIn();
//		Thread.sleep(1000);
//		genericUtils.hover(h.pendentsLink());
//		h.alphabetsLink().click();
//		Thread.sleep(1000);
//		genericUtils.hover(h.wishlistProduct());
//		Thread.sleep(1000);
//		h.wishlistProduct().click();
//		Thread.sleep(1000);
//		String s = h.wishlistProductDescriptn().getText();
//		System.out.println(h.wishlistProductDescriptn().getText());
//		h.addToWishlist().click();
//		Thread.sleep(1000);
//		genericUtils.scroll(-200);
//		Thread.sleep(1000);
//		h.wishlist().click();
//		Thread.sleep(1000);
//		genericUtils.scroll(200);
//		Thread.sleep(1000);
//		BaseTest.addingProduct(s, h.wishlistproductverify());
//	}
}
