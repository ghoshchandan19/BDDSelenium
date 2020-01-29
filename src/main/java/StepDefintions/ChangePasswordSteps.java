package StepDefintions;

import org.openqa.selenium.WebDriver;

import PageActions.ChangePasswordFeature;
import cucumber.api.java.en.Then;

public class ChangePasswordSteps {

	ChangePasswordFeature cpf;
	private WebDriver driver;

	@Then("User Clicks on change password from dropdown")
	public void user_Clicks_on_change_password_from_dropdown() throws InterruptedException {

		cpf = new ChangePasswordFeature(driver);
		cpf.clickDropDown();
		Thread.sleep(4000);
	}

	@Then("User clicks on change password")
	public void user_clicks_on_change_password() {
		cpf.clickOnChangePassword();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {

	}

}
