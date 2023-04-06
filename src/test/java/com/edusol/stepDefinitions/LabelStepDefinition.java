package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.LabelCreation;
import com.edusol.pom.SettingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LabelStepDefinition {
	LabelCreation lc;
	static Logger log= LogManager.getLogger(LabelStepDefinition.class);
	@Given("user is on home page")
	public void user_is_on_home_page() {
		log.info("user is on home page");
	}

	@When("user creates new label")
	public void user_creates_new_label() {
		lc= new LabelCreation();
		lc.createLabel();
		log.debug("user creates new label");
	}
	
	
	@Then("user should see new label created")
	public void user_should_see_new_label_created() {
		lc.newLabelCreated();
		log.info("user should see new label created");
	}
}
