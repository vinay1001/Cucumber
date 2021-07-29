package com.api.multipleWindows;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class multipleStepDfn {

	private ChromeDriver driver = new ChromeDriver();
	private ArrayList<String> windows; 
	
	@Given("given page is {string}")
	public void given_page_is(String string) {
	    
		driver.get(string);
		
	
	}
	@When("I click on the page tryityourself option and will open the child browser window")
	public void i_click_on_the_page_tryityourself_option_and_will_open_the_child_browser_window() {
	    
		WebElement element = driver.findElementByXPath("//a[@class=\"w3-btn w3-margin-bottom\"]");
		element.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2)); //wait till windows count = 2
		
		System.out.println(element.getText());
		
	}
	@When("switch to child browser window and click on home button")
	public void switch_to_child_browser_window_and_click_on_home_button() {
	    
		windows = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getCurrentUrl());
		
		WebElement home = driver.findElementByXPath("/html//a[@id='tryhome']");
		home.click();
		windows = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(2));
		System.out.println(driver.getCurrentUrl());
		
		
	}
	@When("I call the quit method and it will close the browser")
	public void i_call_the_quit_method_and_it_will_close_the_browser() {
	    
		driver.quit();
	}
}
