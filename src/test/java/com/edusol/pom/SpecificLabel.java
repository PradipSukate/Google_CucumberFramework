package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class SpecificLabel extends CommonMethods {

	public void movetoTargetLabel() {
		 
		 hardwait(2000);
		 List<WebElement>  tickBox= driver.findElements(By.xpath(PropertyReader.getPropValue("tickBox_xpath"))); 
		 System.out.println(tickBox.size());
		 tickBox.get(0).click();;
		 hardwait(2000);
		 List<WebElement> moveToBtn= driver.findElements(By.xpath(PropertyReader.getPropValue("moveToBtn_xpath")));
		 //waitForClick(moveToBtn);
		 System.out.println(moveToBtn.size());
		 moveToBtn.get(0).click();;;
		 hardwait(2000);
		 //WebElement testingLabel= driver.findElement(By.xpath(PropertyReader.getPropValue("testingLabel_xpath"))); 
		// testingLabel.click();
		// hardwait(2000);
		 WebElement testing1option= driver.findElement(By.xpath(PropertyReader.getPropValue("testing1_xpath"))); 
		 testing1option.click();
		
	}
	
	public void seeMovedMail() {
		hardwait(2000);
		WebElement testing1Label= driver.findElement(By.xpath(PropertyReader.getPropValue("testing1Label_xpath")));
		testing1Label.click();
		hardwait(2000);
		WebElement euroschool= driver.findElement(By.xpath(PropertyReader.getPropValue("euroschool_xpath")));
        System.out.println("Mail received from " + euroschool.getText() + " moved to testing1 Label");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
