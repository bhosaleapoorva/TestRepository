package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsNew {
	
	
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
	String path=System.getProperty("user.dir")+"\\report\\index.html";  //location where the report is to be kept.
	extent=new ExtentReports();
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("WebAutomation Results");   
	reporter.config().setDocumentTitle("Test Results"); 
	reporter.config().setTheme(Theme.DARK);
	
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA", "Apoorva");
	
	return extent;

	}

}