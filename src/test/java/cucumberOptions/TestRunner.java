package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features="src/test/java/features/Login.feature", 
	glue="StepDefination",
	monochrome=true,
	
	strict=true,
	dryRun=false,
	format= {"pretty","html:test-output"},
	
	tags= {"@SmokeTest , @RegressionTest"}
	)          
	public class TestRunner {
	 
		
//		 extends AbstractTestNGCucumberTests
		
		
	}

	
