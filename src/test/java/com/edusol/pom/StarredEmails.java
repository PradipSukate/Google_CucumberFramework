package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class StarredEmails extends CommonMethods {

	
	public void starredMailTraverse() {
		hardwait(2000);
		WebElement starred= driver.findElement(By.xpath(PropertyReader.getPropValue("starredMail_xpath")));
		starred.click();
	}
	
	public void countStarredMails() {
		hardwait(2000);
		List<WebElement> starMailCount= driver.findElements(By.xpath(PropertyReader.getPropValue("starMailCount_xpath")));
		//System.out.println(starMailCount.size());
		System.out.println("Total no of starred mails are " + starMailCount.get(1).getText());
	
}
}