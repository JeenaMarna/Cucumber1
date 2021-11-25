package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTag {
	@Given("Login window should load with username and password field")
	public void login_window_should_load_with_username_and_password_field() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step1: Login Test");
	}

	@When("I put correct {string} and correct {string} and click on login")
	public void i_put_correct_and_correct_and_click_on_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step2: I put correct credentials");
	}

	@Then("I should be able to login")
	public void i_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step3: I should be able to login");
	}

	@When("I put incorrect {string} and correct {string} and click on login")
	public void i_put_incorrect_and_correct_and_click_on_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step4: I put incorrect username and correct password");
	}

	@Then("I should not be able to login")
	public void i_should_not_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step5: I should not be able to login");
	}

	@When("I put correct {string} and incorrect {string} and click on login")
	public void i_put_correct_and_incorrect_and_click_on_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step6: I put correct username and incorrect password");
	}
	
	
}
