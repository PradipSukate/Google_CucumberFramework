package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class TotalEmails extends CommonMethods {
           
	public void totalMailsTraverse() {
		hardwait(2000);
		List<WebElement> moreBtn= driver.findElements(By.xpath(PropertyReader.getPropValue("moreBtn_xpath")));
		moreBtn.get(0).click();
		hardwait(2000);
		WebElement allMail= driver.findElement(By.xpath(PropertyReader.getPropValue("allMail_xpath")));
		allMail.click();
		hardwait(2000);
		List<WebElement> next1= driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		next1.get(1).click();
		hardwait(3000);
		List<WebElement> next2= driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		next2.get(2).click();
		hardwait(3000);
		List<WebElement> next3= driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		next3.get(2).click();
	}
	public void countTotalMails() {
		
		hardwait(2000);
		List<WebElement> totalMailcount= driver.findElements(By.xpath(PropertyReader.getPropValue("totalMailcount_xpath")));
		System.out.println("Total no of mails are: " + totalMailcount.get(5).getText());

	}
}
