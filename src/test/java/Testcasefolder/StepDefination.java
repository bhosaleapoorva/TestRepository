package Testcasefolder;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.loginpageobject;
import resources.BasefileC;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class StepDefination extends BasefileC {
	
	WebDriver driver;
	loginpageobject login;

    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
		driver=InitializeWebDriver();		
		System.out.println("Driver is initialized");
    }
    

    @When("^click on signin button$")
    public void click_on_signin_button() throws Throwable {
    	login=new loginpageobject(driver);
		login.login();
		System.out.println("Login is clicked");	
    }

    @Then("^signin is successful$")
    public void signin_is_successful() throws Throwable {
    	System.out.println("Login is successful");
    }
    
    @Then("^signin is not successful$")
    public void signin_is_not_successful() throws Throwable {
    	System.out.println("Sign in is not successful");    
    	}
    
    @When("^user enters username and password$")
    public void user_enters_username_and_password(DataTable data) throws Throwable {
    	List<List<String>> datavalues= data.raw();
    	String s1=datavalues.get(0).get(0);
    	String s2=datavalues.get(0).get(1);
    	System.out.println(s1);
    	System.out.println(s2);
    }

}