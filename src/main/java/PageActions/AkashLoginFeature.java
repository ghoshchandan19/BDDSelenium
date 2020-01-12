package PageActions;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Pages.AkashLoginPage;
//Action for the login page
public class AkashLoginFeature {
	
	WebDriver driver;
	AkashLoginPage alp;
	
	public AkashLoginFeature(WebDriver driver)
	{
		this.driver=driver;
		alp=new AkashLoginPage(driver);
		
	}
	
	public void getTitle()
	{
		String titlePage = driver.getTitle();
		System.out.println("Ttile of the page"+ titlePage);
	}
	
	public void enterLoginCred(String username,String password)
	{
		alp.getEmail().sendKeys(username);
		alp.getPassword().sendKeys(password);
		Reporter.log("Credentials entered", true);
	}
	
	public void login()
	{
		alp.getSignBtn().click();
		Reporter.log("Login button Clicked", true);
	}

}
