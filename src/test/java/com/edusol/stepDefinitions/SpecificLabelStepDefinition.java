package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.LabelCreation;
import com.edusol.pom.SpecificLabel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpecificLabelStepDefinition {
	SpecificLabel sl;
	static Logger log= LogManager.getLogger(SpecificLabelStepDefinition.class);
	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		log.info("user is on dashboard page");
	}

	@When("user want to send specific mail to target label folder")
	public void user_want_to_send_specific_mail_to_target_label_folder() {
		sl = new SpecificLabel();
		sl.movetoTargetLabel();
		log.debug("user want to send specific mail to target label folder");
	}
	
	
	@Then("user should see mail moved to target label folder")
	public void user_should_see_mail_moved_to_target_label_folder() {
		sl.seeMovedMail();
		log.info("user should see mail moved to target label folder");
	}
}
