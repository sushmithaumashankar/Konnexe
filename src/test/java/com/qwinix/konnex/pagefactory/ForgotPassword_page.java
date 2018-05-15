package com.qwinix.konnex.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.konnex.runner.BaseClass;

public class ForgotPassword_page {
	public ForgotPassword_page() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Forgot Password?")
	public WebElement forgotPassword_link;
	
	@FindBy(how=How.XPATH,using=".//*[@id='FirstName']/div/form/div[1]/input")
	public WebElement forgotpassword_field;
	
	@FindBy(how=How.XPATH,using=".//*[@id='FirstName']/div/form/div[3]/button")
	public WebElement forgotPassword_button;

}
