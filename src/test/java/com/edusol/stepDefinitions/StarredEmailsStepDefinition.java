package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.SpecificLabel;
import com.edusol.pom.StarredEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarredEmailsStepDefinition {
	StarredEmails st;
	static Logger log= LogManager.getLogger(StarredEmailsStepDefinition.class);
	@Given("i am on home page")
	public void i_am_on_home_page() {
		log.info("i am on home page");
	}

	@When("i want to count starred emails")
	public void i_want_to_count_starred_emails() {
		st= new StarredEmails();
		st.starredMailTraverse();
		log.debug("i want to count starred emails");
	}
	
	
	@Then("i counted starred emails")
	public void i_counted_starred_emails() {
		st.countStarredMails();
		log.info("i counted starred emails");
	}
}
