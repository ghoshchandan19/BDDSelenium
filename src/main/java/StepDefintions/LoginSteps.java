package StepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPage;
import Utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends TestBase{

	WebDriver driver;
	LoginPage lp;

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		/*
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan Ghosh\\eclipse-workspace\\EcommerceApp\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		 WebDriverManager.chromedriver().setup();
		 
	        //Create driver object for Chrome
	         driver = new ChromeDriver();
	 
	        
	 
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		*/
		TestBase.browserInitalize();
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();

	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$") 
	public void user_enters_valid_and(String username, String password)throws Throwable {
		// driver.findElement(By.id("username")).sendKeys("ghoshchandan19@gmail.com");
		// driver.findElement(By.id("password")).sendKeys("pisoftek@2016");
		lp=new LoginPage(driver);
		lp.getUnTxtBx().sendKeys(username);
		lp.getPwtXtBx().sendKeys(password);
	

	}

	@When("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		//driver.findElement(By.name("login")).click();
		lp.getLoginBtn().click();
	}

	@Then("^user succesfully logins into the application$")
	public void user_succesfully_logins_into_the_application() throws Throwable {
		String expResult = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals("Dashboard", expResult);
		driver.quit();
	}

	// Steps for valid username and invalid password
	@When("^user enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("ghoshchandan19@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc");

	}

	@Then("^user gets a message the passord entered is incorrect$")
	public void user_gets_a_message_the_passord_entered_is_incorrect() throws Throwable {
		String expError = driver.findElement(By.xpath("//div[@id='body']//li[1]")).getText();
		Assert.assertEquals("ERROR: The password you entered for the username", expError.substring(0, 48));
		driver.quit();

	}

	// Steps for invalid username and valid password
	@When("^user enters invalid username and valid password$")
	public void user_enters_invalid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("ghoshchandan9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("pisoftek@2016");
	}

	@Then("^user gets a message the user could not be found$")
	public void user_gets_a_message_the_user_could_not_be_found() throws Throwable {
		String expResult = driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).getText();
		Assert.assertEquals("Error: A user could not be found with this email address.", expResult);
		driver.quit();
	}

}
