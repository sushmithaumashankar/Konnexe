package com.qwinix.konnex.stepDefinitions;

import com.qwinix.konnex.configReader.UserSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPassword_step {
	
	UserSteps userObj=new UserSteps();
	
	@When("^I click on forgot password link$")
	public void i_click_on_forgot_password_link() throws Throwable {
		userObj.forgotPassword_link();
	    
	}

	@When("^I click on submit button for forgot password$")
	public void click_on_submit_button_for_forgot_password() throws Throwable {
		userObj.fPassword_button();
	   
	}

	@Then("^button should be disabled for forgot password$")
	public void button_should_be_disabled_for_forgot_password() throws Throwable {
	    
	}

	@When("^I enter unregistered \"([^\"]*)\" for forgot password$")
	public void i_enter_unregistered_for_forgot_password(String uemail) throws Throwable {
		userObj.fPassword_field(uemail);
	   
	}

	@Then("^I should be able to see error message for password reset$")
	public void i_should_be_able_to_see_error_message_for_password_reset() throws Throwable {
	    
	}

	@When("^I enter \"([^\"]*)\" address for forgot password$")
	public void i_enter_address_for_forgot_password(String vemail) throws Throwable {
	   userObj.fPassword_field(vemail);
	}

	@Then("^I should be able to see successful message for password reset\\.$")
	public void i_should_be_able_to_see_successful_message_for_password_reset() throws Throwable {
	   
	}

}
