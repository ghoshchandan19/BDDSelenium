package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public abstract class BasePage {
	
	@FindBy(xpath="//a[@class='img_wrapper']//span[@class='caret']")
	private @Getter WebElement dropdown;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
