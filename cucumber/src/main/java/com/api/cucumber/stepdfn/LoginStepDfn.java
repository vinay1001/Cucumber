package com.api.cucumber.stepdfn;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class LoginStepDfn {
	
	@Given("User is at the login page of the application")
	public void user_is_at_the_login_page_of_the_application() {
	  
	    //throw new io.cucumber.java.PendingException();
	}
	@When("User login with the following username and password")
	public void user_login_with_the_following_username_and_password(DataTable table) {
		
		System.out.println("Login username and password");
		
	    List<List<String>> data = table.asLists();
	    
		for(List<String> str: data)
		{
			for(String str1 : str)
			{
				System.out.println("Data: " + str1);
			}
		}
		
	    
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("User should be able to login with correct username and password")
	public void user_should_be_able_to_login_with_correct_username_and_password() {
	    
	    //throw new io.cucumber.java.PendingException();
	}

}
