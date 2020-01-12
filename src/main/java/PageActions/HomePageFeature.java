package PageActions;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;

public class HomePageFeature {
	
	WebDriver driver;
	HomePage hp;
	
	public HomePageFeature(WebDriver driver)
	{
		this.driver=driver;
		hp=new HomePage(driver);
	}
	
	public void clickLohinBtn()
	{
		hp.getLoginBtn().click();
	}

}
