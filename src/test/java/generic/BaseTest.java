package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BaseTest 
{
public static WebDriver driver;
	
	public BaseTest(WebDriver driver)
	{
		this.driver = driver;
		
	}
	 public static void pageVerification(String etitle , String atitle)
	 {
		WebDriverWait wait = new WebDriverWait(driver , 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(etitle));
			if(etitle.contains(atitle))
			{
				Reporter.log("Title is matching: pass" , true);
			}
		}
		catch (Exception e) 
		{
			Reporter.log("title is not matching: fail" , true);
		}
	 }
	 
	 public static void elementVerification(WebElement element)
	 {
		WebDriverWait wait = new WebDriverWait(driver , 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is visible: pass" , true);
		}
		catch (Exception e) 
		{
			Reporter.log("Element is not visible: fail" , true);
		}
	 }
	 
	 public static void priceVerification(ArrayList<Integer> a)
	 {
		 ArrayList<Integer> al = new ArrayList<Integer>(a);
		 Collections.sort(al);
		 for(int i=0; i<al.size() ; i++)
		 {
			 if(!(a.get(i) == al.get(i)))
			 {
				 Reporter.log("Product is not arranged in ascending order: fail", true);
			 }
			 
		 }
		 
	 }
	 
	 public static void addingProduct(String first , List<WebElement> second)
	 {
		 for(WebElement wb : second)
		 {
			 if(first.contains(wb.getText()))
			 {
				 Reporter.log("Product got added successfully:pass" , true);
				 
			 }
			
			
		 }
		 
		Reporter.log("product not added:fail" , true);
		System.exit(0);
		 
		 
			
		 
	 }
}
