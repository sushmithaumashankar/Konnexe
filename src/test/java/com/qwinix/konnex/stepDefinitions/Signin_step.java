package com.qwinix.konnex.stepDefinitions;

import com.qwinix.konnex.configReader.UserSteps;
import com.qwinix.konnex.pagefactory.Signin_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin_step 
{
	UserSteps userObj=new UserSteps();
	Signin_page signinObj=new Signin_page();
	
//	Invalid_signin
	@Given("^I am on Konnexe website$")
	public void i_am_on_Konnexe_website() throws Throwable {
		userObj.openUrl(); 
	}

	@When("^I click on sign in link$")
	public void i_click_on_sign_in_link() throws Throwable {
		userObj.signinLink(); 
	}
	
	@When("^I enter my invalid \"([^\"]*)\" or \"([^\"]*)\"$")
	public void i_enter_my_invalid_or(String in_email, String in_password) throws Throwable {
	   userObj.invalid_creadentials(in_email, in_password);
	}
	
	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable
	{
		userObj.signinBtn();
		  Thread.sleep(4000);
	}

	@Then("^I should be able to see error message$")
	public void i_should_be_able_to_see_error_message() throws Throwable {
//	   signinObj.errorMsg_invalid_credentials();
	}
	
//	Unregistered_email
	@When("^I enter my unregistered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_my_unregistered_and(String un_email, String un_password) throws Throwable 
	{
	   userObj.unregistered_email(un_email, un_password);
	}

	@Then("^I should be able to see error message for unregistered email$")
	public void i_should_be_able_to_see_error_message_for_unregistered_email() throws Throwable 
	{
					
	}
	    
//	Valid_signin
	@When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_my_and(String va_email, String va_password) throws Throwable
	{
		userObj.getCredentials(va_email, va_password);  
	}


	@Then("^I should be able to see Konnexe homepage$")
	public void i_should_be_able_to_see_Konnexe_homepage() throws Throwable 
	{
	   
	}

}
