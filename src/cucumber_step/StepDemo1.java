package cucumber_step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDemo1 {
	@Given("^User able to open the browser$")
	public void User_able_to_open_the_browser() throws Throwable {
	    System.out.println("User_able_to_open_the_browser");
	}

	@Given("^User able to enter the Url$")
	public void User_able_to_enter_the_Url() throws Throwable {
	    System.out.println("User_able_to_enter_the_Url");
	}

	@When("^user able to enter the username$")
	public void user_able_to_enter_the_username() throws Throwable {
	    System.out.println("user_able_to_enter_the_username");
	}

	@When("^user able to enter the password$")
	public void user_able_to_enter_the_password() throws Throwable {
	    System.out.println("user_able_to_enter_the_password");
	}

	@When("^user able to click on submit button$")
	public void user_able_to_click_on_submit_button() throws Throwable {
	    System.out.println("user_able_to_click_on_submit_button");
	}

	@Then("^user able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable {
	   System.out.println("user_able_to_login_successfully");
	}


}
