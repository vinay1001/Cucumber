package com.api.multipleWindows;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/main/java/com/api/multipleWindows/multiple.feature"},
		glue = {"com.api.multipleWindows"},
		dryRun = false,
		monochrome = true
		
		)
public class multipleRunner extends AbstractTestNGCucumberTests{

}
