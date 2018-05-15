package com.qwinix.konnex.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.konnex.runner.BaseClass;

public class Feeds_page 
{
	
	public Feeds_page()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='landingPage']/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/div/form/textarea")
	public WebElement title;
	
	@FindBy(how=How.XPATH,using="//*[@id='landingPage']/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/div/form/div[2]/button[2]")
	public WebElement post_create;
	
	@FindBy(how=How.XPATH,using="//*[@id='landingPage']/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/div/form/div[2]/textarea")
	public WebElement description;
	
	@FindBy(how=How.LINK_TEXT,using="Include a photo")
	public WebElement image;
	
	@FindBy(how=How.XPATH,using="//*[@id='landingPage']/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/div/form/div[2]/button[1]")
	public WebElement post_cancel;

}

