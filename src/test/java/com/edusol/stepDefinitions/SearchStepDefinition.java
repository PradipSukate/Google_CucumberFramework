package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.SearchMail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	
	SearchMail sm;
	static Logger log= LogManager.getLogger(SearchStepDefinition.class);
	
	@Given("user is already on dashboard page")
	public void user_is_already_on_dashboard_page() {
		log.info("user is already on dashboard page");
	}

	@When("user search about specific mail address")
	public void user_search_about_specific_mail_address() {
		sm= new SearchMail();
		sm.searchingMail();
		log.debug("user search about specific mail address");
	}

	@Then("user should see all emails respective to specific mail address")
	public void user_should_see_all_emails_respective_to_specific_mail_address() {
		sm.specificMailList();
		log.info("user should see all emails respective to specific mail address");
	}
}
