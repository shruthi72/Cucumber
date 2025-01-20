package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingproductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public genericUtils genericUtils;
	
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new genericUtils(testBase.WebDriverManager());
	}

}
