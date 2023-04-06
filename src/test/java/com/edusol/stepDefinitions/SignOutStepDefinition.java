package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.ReadEmails;
import com.edusol.pom.SignOut;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutStepDefinition {
	static Logger log= LogManager.getLogger(SignOutStepDefinition.class);
	SignOut so;
	@Given("i am on gmail dashboard page")
	public void i_am_on_gmail_dashboard_page() {
		log.info("i am on gmail dashboard page");
	}

	@When("i want to sign out gmail")
	public void i_want_to_sign_out_gmail() {
		so= new SignOut();
		so.signout();
		log.debug("i want to sign out gmail");
	}
	
	
	@Then("i have signed out gmail")
	public void i_have_signed_out_gmail() {
		so.homePagereturns();
		log.info("i have signed out gmail");
	}
}
