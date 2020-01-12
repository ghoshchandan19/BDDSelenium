package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenerImp extends ExtentReportListener implements ITestListener{
	
	private static ExtentReports extent;
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started on UAT environment");
		extent=setUp();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Got completed");
		extent.flush();
		
	}
	

}
