package com.qwinix.konnex.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.konnex.runner.BaseClass;

public class Signin_page
{
	public Signin_page() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='navbar']/ul[2]/li[3]/a")
	public WebElement signin_link;
	
	@FindBy(how=How.ID,using="exampleInputEmail1")
	public WebElement signin_email;
	
	@FindBy(how=How.ID,using="exampleInputPassword1")
	public WebElement signin_password;
	
	@FindBy(how=How.XPATH,using="//*[@id='FirstName']/div/form/div[4]/button")
	public WebElement signin_button;
	
	@FindBy(how=How.XPATH,using="//*[@id='FirstName']/div/p")
	public WebElement email_error;
	
}