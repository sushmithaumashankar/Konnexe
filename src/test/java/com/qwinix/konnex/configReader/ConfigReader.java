package com.qwinix.konnex.configReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	Properties pro;
	public ConfigReader()
	{
		try 
		{
			File src=new File("./Configuration/config.property");
			FileInputStream fis;
			fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is" + e.getMessage());
		}	
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getChromePath() 
	{
		String chropath=pro.getProperty("ChromePath");
		return chropath;
	}
	
	public String getFirefoxPath() 
	{
		String ffpath=pro.getProperty("FirefoxPath");
		return ffpath;
	}
	
	public String getUrl() 
	{
		return pro.getProperty("Url");
	}	
	
}
