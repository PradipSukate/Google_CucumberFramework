package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class LabelCreation extends CommonMethods{

	 public void createLabel() {
		 hardwait(2000);
		WebElement createBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("createNewLabel_xpath"))); 
		createBtn.click();
		hardwait(2000);
		WebElement labelName= driver.findElement(By.xpath(PropertyReader.getPropValue("labelName_xpath"))); 
		labelName.clear();
		labelName.click();
		labelName.sendKeys("Testing4");
		hardwait(2000);
		WebElement create= driver.findElement(By.xpath(PropertyReader.getPropValue("createBtn_xpath"))); 
		create.click();
	 }
	 
	 public void newLabelCreated() {
		 WebElement testing4= driver.findElement(By.xpath(PropertyReader.getPropValue("testing4_xpath"))); 
		 System.out.println("New Label Created is " + testing4.getText());
		 
	 }
	 
	 
}
