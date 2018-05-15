package com.qwinix.konnex.stepDefinitions;

import com.qwinix.konnex.configReader.UserSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feeds_step 
{
	UserSteps userObj=new UserSteps();
	
	@When("^I click on feeds$")
	public void i_click_on_feeds() throws Throwable 
	{
		userObj.enter_title_field();
	}

	@When("^I donot enter anything and click on post button$")
	public void i_donot_enter_anything_and_click_on_post_button() throws Throwable
	{
		userObj.check_feeds_button();
	}

	@Then("^I should be not able to create a feed$")
	public void i_should_be_not_able_to_create_a_feed() throws Throwable {
	}

	@When("^I donot enter anything in title and when I enter description$")
	public void i_donot_enter_anything_in_title_and_when_I_enter_description() throws Throwable 
	{
		userObj.decription_field();
	}

	@When("^I click on post button$")
	public void i_click_on_post_button() throws Throwable 
	{
		userObj.check_feeds_button();
		Thread.sleep(3000);
	}

	@Then("^post button should be disabled$")
	public void post_button_should_be_disabled() throws Throwable {	
	}

	@When("^I enter title and I donot enter anything in the description$")
	public void i_enter_title_and_I_donot_enter_anything_in_the_description() throws Throwable
	{
		userObj.title_field();
	}

	@When("^I enter title and description$")
	public void i_enter_title_and_description() throws Throwable 
	{
	    userObj.title_field();
	    userObj.decription_field();
	}

	@When("^I upload photo$")
	public void i_upload_photo() throws Throwable 
	{
		userObj.upload_image();
		Thread.sleep(4000);
	}
	
	@When("^I click on post button for feeds creation$")
	public void i_click_on_post_button_for_feeds_creation() throws Throwable
	{
		userObj.check_feeds_button();
	}

	@Then("^I should be able to see feed created successfully$")
	public void i_should_be_able_to_see_feed_created_successfully() throws Throwable{
	}

}
