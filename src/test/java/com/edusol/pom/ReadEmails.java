package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class ReadEmails extends CommonMethods {
 
	public void readMailsTraverse() {
		
		hardwait(2000);
		WebElement searchBox= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBox_xpath")));
		searchBox.sendKeys("label: read");
		hardwait(2000);
		WebElement searchBTN= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBTN_xpath")));
		searchBTN.click();
		hardwait(2000);
		List<WebElement>  next= driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
	      //  System.out.println(next.size());
	    next.get(1).click();
	}
	 public void countReadMails() {
	    hardwait(2000);
		List<WebElement>  readmailcount= driver.findElements(By.xpath(PropertyReader.getPropValue("readmailcount_xpath")));
		System.out.println("Total no of read mails are: " + readmailcount.get(3).getText());
	}
}
