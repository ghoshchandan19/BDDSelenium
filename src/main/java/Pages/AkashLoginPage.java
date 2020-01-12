package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class AkashLoginPage {
	
	@FindBy(id="reg_login_email")
	private @Getter WebElement email;
	
	@FindBy(id="reg_login_password")
	private @Getter WebElement password;
	
	@FindBy(id="reg_login_btn")
	private @Getter WebElement signBtn;
	
	public AkashLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
