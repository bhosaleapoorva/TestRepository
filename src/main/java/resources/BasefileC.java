package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasefileC {
	
	WebDriver driver;
	String browsername;
	private String url;
	Properties prop;
	FileInputStream fis;
	
	
	public WebDriver InitializeWebDriver() throws IOException
	{
		
		prop=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		browsername=prop.getProperty("browser");
		url=prop.getProperty("url");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\IT\\Softwares\\chromedriver96\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;

	}
	
	public String getScreenshotPath(String testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
		
	}
}
