package com.qwinix.konnex.configReader;

import org.openqa.selenium.WebDriver;

import com.qwinix.konnex.pagefactory.Feeds_page;
import com.qwinix.konnex.pagefactory.ForgotPassword_page;
import com.qwinix.konnex.pagefactory.Signin_page;
import com.qwinix.konnex.runner.BaseClass;

public class UserSteps 
{	
	Signin_page signinObj=new Signin_page();
	ForgotPassword_page passwordObj=new ForgotPassword_page();
	Feeds_page feedsObj=new Feeds_page();
	public WebDriver driver=BaseClass.driver;
	ConfigReader config=new ConfigReader();

	public void openUrl() 
	{
		driver.get(config.getUrl());
		driver.manage().window().maximize();
	}
	
//	Sign_in
	public void signinLink()
	{
		signinObj.signin_link.click();
	}
	
	public void invalid_creadentials(String in_email,String in_password)
	{
		signinObj.signin_email.sendKeys(in_email);
		signinObj.signin_password.sendKeys(in_password);
	}
	public void getCredentials(String valid_email,String valid_password) 
	{
		 signinObj.signin_email.sendKeys(valid_email);
		 signinObj.signin_password.sendKeys(valid_password);
	}
	public void signinBtn() 
	{
		 signinObj.signin_button.click();
	}
	
	public void unregistered_email(String un_email,String un_password) 
	{
		signinObj.signin_email.sendKeys(un_email);
		signinObj.signin_password.sendKeys(un_password);
	}
	
//	Forgot_password
	public void forgotPassword_link() 
	{
		passwordObj.forgotPassword_link.click();
	}
	
	public void fPassword_field(String fEmail)
	{
		passwordObj.forgotpassword_field.sendKeys(fEmail);
	}
	
	public void fPassword_button() 
	{
		passwordObj.forgotPassword_button.click();
	}
	
//	Create_feeds
	public void enter_title_field() 
	{
		feedsObj.title.click();
	}
	
	public void title_field() 
	{
		feedsObj.title.sendKeys("Testing title");
	}
	
	public void decription_field() 
	{
		feedsObj.description.sendKeys("Testing description");
	}
	
	public void upload_image() 
	{
		feedsObj.image.sendKeys("//home/sushmitha/Downloads/images.jpg");
	}
	
	public void check_feeds_button() {
		if(feedsObj.post_create.isEnabled()) 
		{
			feedsObj.post_create.click();
			System.out.println("Feed created successfully");
		}
		else 
		{
			System.out.println("Error while creating feeds");
		}
	}
	
}
