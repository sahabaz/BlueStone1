package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericUtils extends BasePage 
{
	public static void selectByText(WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);	
	}
	
	public static void selectByValue(WebElement element , String s) throws InterruptedException
	{
		Select sel = new Select(element);
		Thread.sleep(1000);
		sel.selectByValue("s");
	}
	
	public static void selectByIndex(WebElement element , int n)
	{
		Select sel = new Select(element);
		sel.selectByIndex(n);
	}
	
	
	
	public static void hover(WebElement toElement)
	{
		Actions act =  new Actions(driver);
		act.moveToElement(toElement).perform();
	}
	
	public static void scroll(int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")", "");
	}
}
