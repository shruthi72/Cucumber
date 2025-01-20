package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@After
	public void afterScenarios() throws IOException
	{
		testContextSetup.testBase.WebDriverManager().quit();
		
	}
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			WebDriver driver=testContextSetup.testBase.WebDriverManager();
			//Screenshot Code
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //src is in file format now
			//attach method takes first argument as byte format , file to byte conversion need to do
			//in mvn repository copy "apache commons io" and put in pom.xml file
			byte[] fileContent=FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "image"); 
		}
		System.out.println("Screenshot");
		}

}
