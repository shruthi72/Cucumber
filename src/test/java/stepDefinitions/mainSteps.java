package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("On Landing Page");
	    }
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
		System.out.println(username+" and password is"+password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("On Home Page");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards Displayed");
	}
	@Given("User is on Practice page")
	public void user_is_on_practice_page() {
		System.out.println("Parctice Page Displayed");
	    
	}
	@When("User SignUp into application")
	public void user_sign_up_into_application(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database()
	{
		System.out.println("**Setup Prereq.**");
	}
	
	@When("launch the browser")
	public void launch_the_browser()
	{
		System.out.println("**Launched**");
	}
	@When("Hit Home Page url of banking site")
	public void Hit_Home_Page_url_of_banking_site()
	{
		System.out.println("**Hit**");	
	}
}
