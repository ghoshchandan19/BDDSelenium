package Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(

		features = "src/test/resources/Features/AkashLogin.feature", glue = { "StepDefintions"}
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}

)
public class TestRunner_LoginPage {

	/*
	 * @Test public void RunCukes() { TestNGCucumberRunner testRunner=new
	 * TestNGCucumberRunner(TestRunner_LoginPage.class);
	 */

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {

		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(dataProvider = "features")
	public void feature(PickleEventWrapper eventwrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		// testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	}

	@DataProvider // (parallel=true)
	public Object[][] features() {
		// rturn testNGCucumberRunner.
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		//Reporter.loadXMLConfig("src/test/resources/extentConfig.xml");
		testNGCucumberRunner.finish();

	}
}
