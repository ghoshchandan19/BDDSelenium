package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ChangePasswordPage extends BasePage{
	
	@FindBy(xpath="//button[@class='btn btn-success btn-block']")
	private @Getter WebElement chgPwdBtn;
	public ChangePasswordPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

}
