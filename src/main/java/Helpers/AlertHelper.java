package Helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHelper {
	
	WebDriver driver;
	
	public AlertHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Alert getAlert()
	{
		return driver.switchTo().alert();
	}
	
	public void acceptAlert(WebElement element)
	{
		getAlert().accept();
	}
	
	public void dismissAlert()
	{
		getAlert().dismiss();
	}
	
	public String getAlertText()
	{
		String text = getAlert().getText();
		return text;
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
