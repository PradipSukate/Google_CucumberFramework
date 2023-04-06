package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.AttachmentsInMail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttachmentsStepDefinition {
	static Logger log= LogManager.getLogger(AttachmentsStepDefinition.class);
	AttachmentsInMail am;
	
	@Given("user is on gmail home page")
	public void user_is_on_gmail_home_page() {
		log.info("user is on gmail home page");
	}

	@When("user search mail with attachments")
	public void user_search_mail_with_attachments() {
	    am= new AttachmentsInMail();
	    am.findMailWithAttachments();
	    log.debug("user search mail having attachments");
	}

	@Then("user should see all emails with attachments")
	public void user_should_see_all_emails_with_attachments() {
		am.validationMailWithAttachments();
		log.info("user saw all mails has attachments");
	}
}
