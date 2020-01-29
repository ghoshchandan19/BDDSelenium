package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import Listeners.ExtentReportListener;
import PageActions.AkashLoginFeature;
import PageActions.HomePageFeature;
import Utils.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AkashLoginSteps extends ExtentReportListener {

	AkashLoginFeature alf;// Instance variable
	HomePageFeature hpf;
	private WebDriver driver;

	@Given("^User is on home page of the app$")
	public void user_is_on_home_page_of_the_app() throws Throwable {
		ExtentTest logInfo = null;
		try {
			test = extent.createTest(Feature.class, "Login Feature Validation");
			test = test.createNode(Scenario.class, "To test valid login functionality of elearning app");
			logInfo = test.createNode(new GherkinKeyword("Given"), "user_is_on_home_page_of_the_app");
			driver=BrowserFactory.launchBrowser(driver, "chrome", "http://prep.edgecanvas.com");
			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get("http://prep.edgecanvas.com/");
//			// TestBase.browserInitalize();
			logInfo.pass("Opened chrome browser and entered url");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("User click os login button")
	public void user_click_os_login_button() throws InterruptedException {

		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "user_click_os_login_button");

			hpf = new HomePageFeature(driver);
			hpf.clickLohinBtn();
			Thread.sleep(5000);
			logInfo.pass("User Clicked on Login Button");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "user_enters_valid_and");

			alf = new AkashLoginFeature(driver);

			alf.enterLoginCred(username, password);
			logInfo.pass("User Enters Valid Credentials");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "user_enters_valid_and");
			alf.login();
			logInfo.pass("User Clicked on Login Button");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Then("^User succesfully logins into the application$")
	public void user_succesfully_logins_into_the_application() throws Throwable {
		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("Then"), "user_succesfully_logins_into_the_application");
			alf.getTitle();
			Assert.fail();
			
			logInfo.pass("User Clicked on Login Button");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
			
		}
		
		
		
	}

}
