package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
 public WebDriver driver;
 public String landingproductName;
 public String offerpageName;
 TestContextSetup testContextSetup;
 public TestBase tesBase;
 PageObjectManager pageObjectManager;
 public CheckoutPage checkoutPage;
 public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
 {
	 this.testContextSetup=testContextSetup;
	this.checkoutPage=testContextSetup.pageObjectManager.getcheckoutPage();
 }


@Then("Verify user has ability to enter promo code and place the order")
public void verify_user_has_ability_to_enter_promo_code()
{

	Assert.assertTrue(checkoutPage.VerifyPromoBtn());
	Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	
}

@Then("^User proceeds to Checkout abd validate the (.+) item in checkout page$")
public void user_proceeds_to_checkout(String name)
{
	checkoutPage.CheckOutItem();
	//Thread.sleep(3000);
	//Assertion to extract name from screen and compare with name
	
	
}

	

}
