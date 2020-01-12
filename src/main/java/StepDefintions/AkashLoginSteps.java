package StepDefintions;

import PageActions.AkashLoginFeature;
import PageActions.HomePageFeature;
import Utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AkashLoginSteps extends TestBase {

	AkashLoginFeature alf;// Instance variable
	HomePageFeature hpf;

	@Given("^User is on home page of the app$")
	public void user_is_on_home_page_of_the_app() throws Throwable {

		TestBase.browserInitalize();
	}

	@When("User click os login button")
	public void user_click_os_login_button() throws InterruptedException {
		hpf = new HomePageFeature(driver);
		hpf.clickLohinBtn();
		Thread.sleep(5000);
	}
	
	

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
		alf = new AkashLoginFeature(driver); // Creating the object of AkashLoginFeature class
		alf.enterLoginCred(username, password);
	}

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		alf.login();
	}

	@Then("^User succesfully logins into the application$")
	public void user_succesfully_logins_into_the_application() throws Throwable {
		alf.getTitle();
	}

}
