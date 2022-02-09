package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class loginpageobject
{

WebDriver driver;
@FindBy(xpath="//a[@title='Women']")
WebElement women_title;

By signin_btn=By.xpath("//a[contains(text(),'Sign in')]");
By newaccount_btn= By.id("SubmitCreate");
By email_new=By.id("email_create");
By title=By.xpath("//input[@id='id_gender1']");
By firstname=By.id("customer_firstname");
By lastname=By.id("customer_lastname");
By password=By.id("passwd");
By fname=By.id("firstname");
By lname=By.id("lastname");
By address=By.id("address1");
By city=By.id("city");
By zipcode=By.id("postcode");
By mobilephone=By.id("phone_mobile");

By date_dropdown= By.id("days");
By month_dropdown=By.id("months");
By year_dropdown= By.id("years");
By state=By.id("id_state");
By country=By.id("id_country");
By text=By.id("alias");
By register_btn=By.id("submitAccount");
By logout=By.xpath("//a[@title='Log me out']");

//Add Items locators

By login_email=By.xpath("//input[@id='email']");
By login_pwd=By.xpath("//input[@id='passwd']");
By submitlogin=By.xpath("//button[@id='SubmitLogin']");
By homebtn=By.xpath("//a[@title='Home']");
By womentab=By.xpath("//a[@title='Women']");
By itemlist=By.xpath("//ul[@class='product_list grid row']/li[2]");
By addtocart=By.xpath("//ul[@class='product_list grid row']/li[2]/div/div[2]/div[2]/a[1]/span");
By checkout_btn=By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a");
By proceed_btn=By.xpath("//span[text()='Proceed to checkout']");
By proceed_btnfinal=By.xpath("//button[@name='processCarrier']");
By agreement_btn=By.xpath("//input[@id='cgv']");
By remove_btn=By.xpath("//span[@class='remove_link']/a");
By cart_btn=By.xpath("//div[@class='shopping_cart']/a");



public loginpageobject(WebDriver driver2) {
	driver=driver2;
	
	
}

public void select(WebElement e)
{
	Select option=new Select(e);
	option.selectByValue("1");
	
}

public void login()

{
	try {
		Assert.assertTrue(driver.findElement(signin_btn).isDisplayed());
		driver.findElement(signin_btn).click();
		driver.findElement(email_new).sendKeys("trialsemail@abc.com");	
		driver.findElement(newaccount_btn).click();
//		WebDriverWait wait=new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.elementToBeSelected(title));
		driver.findElement(title).click();
		Thread.sleep(500);
		driver.findElement(firstname).sendKeys("Tests");
		driver.findElement(lastname).sendKeys("Tests");
		driver.findElement(password).sendKeys("TestUser1234!!");
//		driver.findElement(fname).sendKeys("TestUser1");
//		driver.findElement(lname).sendKeys("TestUser1");
		
		driver.findElement(address).sendKeys("TestUser1");
		driver.findElement(city).sendKeys("TestUser1");
		driver.findElement(zipcode).sendKeys("35801");
		driver.findElement(mobilephone).sendKeys("9999900012");
		driver.findElement(text).sendKeys("This is a simple text");
	
		
		select(driver.findElement(date_dropdown));
		select(driver.findElement(month_dropdown));
	
		Select option1=new Select(driver.findElement(year_dropdown));
		option1.selectByValue("2000");
		
		Select option2=new Select(driver.findElement(state));
		option2.selectByValue("1");
		
		Select option3=new Select(driver.findElement(country));
		option3.selectByValue("21");
		
		driver.findElement(register_btn).click();
		driver.findElement(logout).click();		
	}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void UserLogin(String username, String password)
	{
	
		try
			{
			driver.findElement(signin_btn).click();
			driver.findElement(login_email).sendKeys(username);
			driver.findElement(login_pwd).sendKeys(password);
			driver.findElement(submitlogin).click();
			driver.findElement(homebtn).click();
			driver.findElement(womentab).click();
			
			Actions a=new Actions(driver);

			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			
			js.executeScript("arguments[0].scrollIntoView(false);",
			driver.findElement(By.xpath("//ul[@class='product_list grid row']")));
			
			driver.findElement(itemlist).click();
//			driver.findElement(itemlist).click();

			driver.findElement(addtocart).click();
			driver.findElement(checkout_btn).click();
			driver.findElement(proceed_btn).click();
			driver.findElement(proceed_btn).click();
			driver.findElement(agreement_btn).click();
			js.executeScript("arguments[0].scrollIntoView(false);",
					driver.findElement(proceed_btnfinal));
			driver.findElement(proceed_btnfinal).click();
			a.moveToElement(driver.findElement(cart_btn)).build().perform();
			driver.findElement(remove_btn).click();
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	


public void click_title()
{
	Assert.assertTrue(women_title.isDisplayed());
	women_title.click();

}

}
