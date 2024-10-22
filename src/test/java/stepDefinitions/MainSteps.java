package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("user is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User landed on NetBanking Page");
		System.out.println("This is change 1 from GitDummy");
	}
	/*
	 * @When("user login into application") public void
	 * user_login_into_application() { // Write code here that turns the phrase
	 * above into concrete actions
	 * System.out.println("User logs into the application"); }
	 */
	
	/*
	 * @When("user login into application with {string} and pasword {string}")
	 * public void user_login_into_application_with_and_pasword(String username,
	 * String password) { System.out.println(username+ "and Password is "+
	 * password); }
	 */
	
	@When("^user login into application with (.+) and pasword (.+)$")
	public void user_login_into_application_with_and_pasword(String username, String password) {
		System.out.println(username+ "and Password is "+ password);
	}
	
	@Given("user is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Landed on Practice page");
	}
	
	@When("user Signup into application")
	public void user_signup_into_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));

	}
	
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");

	}
 
	@Given("setup the entries in database")
	public void setupEntries()
	{
		System.out.println("**********************");
		System.out.println("Setup entry is done");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser()
	{
		System.out.println("Browser is launched");
	}
	
	@When("hit the home page url of banking site")
	public void hitURL()
	{
		System.out.println("home page URL is hit");
	}


	

}
