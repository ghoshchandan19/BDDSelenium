package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class HomePage {
	
	@FindBy(xpath="//a[@class='pp_auth_btn pp_login_btn']")
	private @Getter WebElement loginBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
