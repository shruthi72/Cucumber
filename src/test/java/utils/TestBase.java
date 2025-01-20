package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		String browser_properties=prop.getProperty("browser");
		
		//added this line later while doing execution in command prompt
		String browser_maven=System.getProperty("browser");
		//result=testCondition ? value1 : value2
		String browser=browser_maven!=null ? browser_maven : browser_properties;
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
		}
		return driver;
	}

}
