package Testcasefolder;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Testcasefolder.pageobjectmethods;


import pageobjects.loginpageobject;
import resources.BasefileC;

public class LoginTest extends BasefileC {
	
	public static Logger log=LogManager.getLogger(LoginTest.class.getName());

	
	WebDriver driver;
//	loginpageobject login;
	loginpageobject login=new loginpageobject(driver);

	
	@BeforeTest
	public void Initializebrowser() throws IOException
	{
		driver=InitializeWebDriver();	
		log.info("Driver is initialized");
		
	}
		
	@Test()
	public void VerifyLogin()
	{
		
		
		try
		{		
		login=new loginpageobject(driver);
		login.login();
		
//		log.info("Working fine" +(LoginTest.class.getName()));
		System.out.println(LoginTest.class.getName());
		
		}
		
		catch(Exception e)
		{
//			log.info("Error found in "+(LoginTest.class.getName()));
//			log.info("Error found in "+e);
		}
	}
	
	@Test(dataProvider="GetCred")
	public void UserLoginTest(String username,String password)
	
	{
		login=new loginpageobject(driver);
		login.UserLogin(username,password);
	}
	
	@DataProvider(name="GetCred")
	public Object GetCred()
	{
		Object data[][]=new Object[2][2];	
		data[0][0]="trialsemail@abc.com";
		data[0][1]="TestUser1234!!";
		return data;
	}
	
	@Test	
	public void Verify_WTitle()
	{
		login.click_title();
		
		
	}
	
//	@Test
//	public void Teardown() {
//		driver.close();
//	}
}
