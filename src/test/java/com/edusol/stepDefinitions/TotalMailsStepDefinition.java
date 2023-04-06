package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.TotalEmails;
import com.edusol.pom.UnreadEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TotalMailsStepDefinition {
	TotalEmails te;
	static Logger log= LogManager.getLogger(TotalMailsStepDefinition.class);
	@Given("i am on gmail dashboard")
	public void i_am_on_gmail_dashboard() {
		log.info("i am on gmail dashboard");
	}

	@When("i want to count total no of emails")
	public void i_want_to_count_total_no_of_emails() {
		te= new TotalEmails();
		te.totalMailsTraverse();
		log.debug("i want to count total no of emails");
	}
	
	
	@Then("i have counted total no of emails")
	public void i_have_counted_total_no_of_emails() {
		te.countTotalMails();
		log.info("i have counted total no of emails");
	}
}
