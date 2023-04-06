package com.edusol.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\resources\\Feature",
		glue= "com\\edusol\\stepDefinitions",
		tags= "@Email",
		//dryRun = true,
				plugin= { "pretty" , "html:target/cucumber-reports/reports.html",
		                "json:target/cucumber-reports/cucumber.json",
		                  "junit:target/cucumber-reports/cucumber.xml" ,
		                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		                }
		)

public class TestRunner {
   
	
}
