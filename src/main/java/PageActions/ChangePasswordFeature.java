package PageActions;

import org.openqa.selenium.WebDriver;

import Pages.ChangePasswordPage;

public class ChangePasswordFeature {
	WebDriver driver;
	ChangePasswordPage cpp;
	public ChangePasswordFeature(WebDriver driver)
	{
		this.driver=driver;
		 cpp = new ChangePasswordPage(driver);
		
	}
	
	public void clickOnChangePassword()
	{
		cpp.getChgPwdBtn().click();
	}
	
	public void clickDropDown()
	{
		cpp.getDropdown().click();
	}
	
	

}
