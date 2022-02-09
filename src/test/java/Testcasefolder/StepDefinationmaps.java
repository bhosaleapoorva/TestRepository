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
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class StepDefinationmaps extends BasefileC {
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hie test");
	}

	@When("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hie");

	}

	@Then("^signin is not successful$")
	public void signin_is_not_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");

	}

   
    
    @When("^user enters username and password$")
    public void user_enters_username_and_password(DataTable data) throws Throwable {
    	
    	for(Map<String,String> datavalues: data.asMaps(String.class, String.class))
    	{    	
	    	String s1=datavalues.get("username");
	    	String s2=datavalues.get("password");
	    	System.out.println(s1);
	    	System.out.println(s2);
	    	System.out.println("It is done and completed");

    	}
    }

}