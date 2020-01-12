package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public  static WebDriver launchBrowser(String browserName)
	{
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	}
		else
		{
			if (browserName.equalsIgnoreCase("firefox"))
			{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		}
		return driver;

}
}
