package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonHelper {
	
	WebDriver driver;
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void click(By locator)
	{
		click(driver.findElement(locator));
	}

}
