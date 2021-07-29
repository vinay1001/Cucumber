package com.api.cucumber.mousekey;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class mkStepDfn {

	private ChromeDriver driver = new ChromeDriver();
	private Actions actions;
	private Action action;
	
	@Given("^we are working with this website \"([^\"]*)\"$")
    public void we_are_working_with_this_website_something(String strArg1) throws Throwable {
        
		driver.get(strArg1);
    }

    @When("^i create the composite action for context click$")
    public void i_create_the_composite_action_for_context_click() throws Throwable {
        
    	
    	//create composite action
    	actions = new Actions(driver);
    	//actions = actions.contextClick(driver.findElement(By.id("droptarget")));
    	
    	WebElement source = driver.findElement(By.id("draggable"));
     	WebElement target = driver.findElement(By.id("droptarget"));
     	
    	actions.dragAndDrop(source,target);
    }

    @When("^I call the quit method to close the webdriver$")
    public void i_call_the_quit_method_to_close_the_webdriver() throws Throwable {
        //driver.quit();
    }

    @Then("^I build the actions$")
    public void i_build_the_actions() throws Throwable {
    	//build the actions by using build method
    	
        action = actions.build();
    }

    @And("^I perform the action$")
    public void i_perform_the_action() throws Throwable {
        
    	//perform the action by calling perform method
    	action.perform();
    	
    }
    
    @Then("I take the screenshot")
    public void i_take_the_screenshot() {
        
    	TakesScreenshot driverScreen = ((TakesScreenshot)driver);
        File screenshot = driverScreen.getScreenshotAs(OutputType.FILE);
        try{
        	FileUtils.copyFile(screenshot,new File("src.png"));
        }
        catch(Exception e)
        {
        	
        }
    }

}
