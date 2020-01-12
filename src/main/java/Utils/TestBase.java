package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;



public class TestBase {
	public static WebDriver driver; 
	public static Properties prop;
	
	/*public TestBase() 
	{
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Chandan Ghosh\\eclipse-workspace\\EcommerceApp\\src\\test\\resources\\TestData\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	public static void browserInitalize()

	{
		
		
		driver = BrowserFactory.launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://prep.edgecanvas.com/");
		Reporter.log("Url is navigated", true);
	}


}
