package com.qwinix.konnex.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		plugin= {"html:target/cucumber-html-report"},
		glue= "com.qwinix.konnex",
		features= "src/test/resources",tags= {"@forgot_password,@signin,@feeds"}

)

public class TestRunner {
	
}
