package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("Login window should load")
	public void login_window_should_load() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step1: Login window should load");
	}

	@When("I put {string} and {string} and click on login")
	public void i_put_and_and_click_on_login(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step2: I put "+username+" and "+password+" and click on login");
	}

	@Then("Dashboard page should load")
	public void dashboard_page_should_load() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step3: Dashboard page should load");
	}
}
