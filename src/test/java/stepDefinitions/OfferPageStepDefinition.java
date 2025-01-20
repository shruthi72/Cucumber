package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;
//Single responsiblity principle
//loosly coupled

public class OfferPageStepDefinition {
 public WebDriver driver;
 public String landingproductName;
 public String offerpageName;
 TestContextSetup testContextSetup;
 PageObjectManager pageObjectManager;
 public OfferPageStepDefinition(TestContextSetup testContextSetup)
 {
	 this.testContextSetup=testContextSetup;
 }
	
	
	@Then("^User searched for (.+) Shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchToOffersPage();
		
		OfferPage offerPage=new OfferPage(testContextSetup.pageObjectManager.driver);
		offerPage.searchItem(shortName);
		Thread.sleep(3000);
		offerpageName=offerPage.getProductName();
		
	}
	
	public void switchToOffersPage()
	{
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase(""))
		//pageObjectManager=new PageObjectManager(testContextSetup.driver);
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		//LandingPage landingPage=new LandingPage(testContextSetup.driver);
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.switchWindowToChild();
	}
	
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_Landing_Page()
	{
		Assert.assertEquals(offerpageName, testContextSetup.landingproductName);
	}

}
