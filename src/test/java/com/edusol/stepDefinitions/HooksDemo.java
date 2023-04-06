package com.edusol.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksDemo extends CommonMethods {

	static Logger log= LogManager.getLogger(GmailStepDefinition.class);
	@Before
	public void initialization() {
		browserLauch(PropertyReader.getPropValue("browser"));
		log.info("you are on browser");
		driver.get(PropertyReader.getPropValue("url"));
		log.info("you are on your webpage");
		hardwait(2000);
		/*
		 * WebElement gmail_btn=driver.findElement(By.xpath(PropertyReader.getPropValue(
		 * "gmail_btn_xpath"))); hardwait(2000); gmail_btn.click(); hardwait(2000);
		 */
		WebElement signIn=driver.findElement(By.xpath(PropertyReader.getPropValue("signIn_xpath")));
		waitForClick(signIn);
		signIn.click();
		hardwait(2000);
		WebElement userid=driver.findElement(By.id(PropertyReader.getPropValue("userid_id")));
		userid.sendKeys("pradipforselenium@gmail.com");
		log.info("you have entered userid to log in");
		WebElement next_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("next_btn_xpath")));
		next_btn.click();
		hardwait(2000);
		WebElement password=driver.findElement(By.xpath(PropertyReader.getPropValue("password_xpath")));
	    password.sendKeys("pradipforselenium11");
	    log.info("you have entered password to log in");
		WebElement pass_btn=driver.findElement(By.xpath(PropertyReader.getPropValue("pass_btn_xpath")));
		waitForDisplay(pass_btn);
		pass_btn.click();
		hardwait(4000);

		
	}
	
	@BeforeStep
public void beforeStep() {
		
	}

	@AfterStep
	public void afterStep(Scenario scenario){
		 
		  if(scenario.isFailed()){
		 TakesScreenshot sc= (TakesScreenshot)driver;
		 final byte[] screenshot= sc.getScreenshotAs(OutputType.BYTES);
		 scenario.attach(screenshot, "image/png", "Evidence");
		 log.info("your testcase has failed ");
		 }
		  
	}
	@After
public void tearDown() {
		
		//driver.quit();
	}
}
