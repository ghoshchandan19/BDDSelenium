package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPage {
	@FindBy(id="username")
	private @Getter WebElement unTxtBx;
	@FindBy(id="password")
	private @Getter WebElement pwtXtBx;
	@FindBy(name="login")
	private @Getter WebElement loginBtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
