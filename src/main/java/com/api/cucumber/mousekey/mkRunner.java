package com.api.cucumber.mousekey;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/main/java/com/api/cucumber/mousekey/mousekey.feature"},
		glue = "com.api.cucumber.mousekey",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/htmlReport"} 
		/*
		 * "html:target/htmlReport" - html report
		 * "json:target/jsonReport/jsonreport.json" - json report
		 * "junit:target/junit/junitreport.xml" - junit report
		*/
		
		)
public class mkRunner extends AbstractTestNGCucumberTests{

}
