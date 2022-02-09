package Testcasefolder;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.ExtentReportsNew;



import resources.BasefileC;

public class Listeners extends BasefileC implements ITestListener {
	
	ExtentTest test;
	
	ExtentReports extent1 =ExtentReportsNew.getReportObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	
	
	@Override
	public void onTestStart(ITestResult result)
	{
		test=extent1.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		extentTest.get().log(Status.FAIL, "Failure");
		String methodname=result.getMethod().getMethodName();
		
		WebDriver d1 = null;
		try {
			d1 = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenshotPath(methodname,d1), result.getMethod().getMethodName());
		}
		catch(IOException e)
		{
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		extent1.flush();

	}

}

	

