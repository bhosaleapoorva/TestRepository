package Testcasefolder;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageobjects.loginpageobject;
import resources.BasefileC;





public class pageobjectmethods extends BasefileC {

	  WebDriver driver;
	 
	 public void Driverset() throws IOException
		{
			driver=InitializeWebDriver();	
			
		}
		
	public loginpageobject login=new loginpageobject(driver);

	
	

}
