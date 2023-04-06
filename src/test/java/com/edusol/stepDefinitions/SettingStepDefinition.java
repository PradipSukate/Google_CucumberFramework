package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusol.pom.SearchMail;
import com.edusol.pom.SettingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingStepDefinition {
	
	SettingPage sp;
	static Logger log= LogManager.getLogger(SettingStepDefinition.class);
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		log.info("user is on homepage");
	}

	@When("user want to see setting page")
	public void user_want_to_see_setting_page() {
		sp = new SettingPage();
		sp.gmailSetting();
		log.debug("user want to see setting page");
	}

	@Then("user is able to see setting page")
	public void user_is_able_to_see_setting_page() {
		sp.settingdashboard();
		log.info("user is able to see setting page");
		
	}

}
