package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.ReadEmails;
import com.edusol.pom.UnreadEmails;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadMailsStepDefinition {
	static Logger log= LogManager.getLogger(ReadMailsStepDefinition.class);
	ReadEmails re;
	@Given("i am on gmail homepage")
	public void i_am_on_gmail_homepage() {
		log.info("i am on gmail homepage");
	}

	@When("i want to count total read emails")
	public void i_want_to_count_total_read_emails() {
		re= new ReadEmails();
		re.readMailsTraverse();
		log.debug("i want to count total read emails");
	}
	
	
	@Then("i have counted total no of read emails")
	public void i_have_counted_total_no_of_read_emails() {
		re.countReadMails();
		log.info("i have counted total no of read emailse");
		
	}
}
