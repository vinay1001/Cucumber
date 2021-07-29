package com.api.cucumber.stepdfn;

import com.api.cucumber.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStepDfn {
	
	//private BaseClass object = new BaseClass(); - without dependency Injection
	
	//constructor injection
	//1. To create a reference variable in the dependent class
	//2. To initialise the reference variable via cons
	
	private BaseClass baseClass;
	
	public PostStepDfn(BaseClass baseClass) {
		this.baseClass = baseClass;
	}
	
	@Given("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
		
		System.out.println("User should be logged in " + baseClass.getFeatureName() );
		System.out.println("User should be logged in " + baseClass.getScenarioName() );
		//throw new PendingException();
    }

    @When("^I type the text in the text box$")
    public void i_type_the_text_in_the_text_box() throws Throwable {
    	System.out.println("I type the text in the text box");
        //throw new PendingException();
    }

    @When("^User supply the youtube link in the text box$")
    public void user_supply_the_youtube_link_in_the_text_box() throws Throwable {
    	System.out.println("User supply the youtube link in the text box");
        //throw new PendingException();
    }

    @Then("^The message get posted$")
    public void the_message_get_posted() throws Throwable {
    	System.out.println("The message get posted");
        //throw new PendingException();
    }

    @Then("^Video should get posted on teh user wall$")
    public void video_should_get_posted_on_teh_user_wall() throws Throwable {
    	System.out.println("Video should get posted on teh user wall");
        //throw new PendingException();
    }

    @And("^Should be present at its own wall$")
    public void should_be_present_at_its_own_wall() throws Throwable {
    	System.out.println("Should be present at its own wall");
        //throw new PendingException();
    }

    @And("^Click on Post button$")
    public void click_on_post_button() throws Throwable {
        //throw new PendingException();
    	System.out.println("Click on Post button");
    }

    @And("^The video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail() throws Throwable {
        //throw new PendingException();
    	System.out.println("The video should have proper thumbnail");
    }
    
    @When("^I type the text as \"([^\"]*)\" in the text box$")
    public void i_type_the_text_as_something_in_the_text_box(String strArg1) throws Throwable {
        //throw new PendingException();
    	System.out.println("When post something like this ");
    	System.err.println(strArg1);
    }
    
    @When("^User supply the youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_something_in_the_text_box(String strArg1) throws Throwable {
        //throw new PendingException();
    	System.out.println("youtube link");
    	System.err.println(strArg1);
    }

}
