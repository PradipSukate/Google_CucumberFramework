package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class UnreadEmails extends CommonMethods {

	public void unreadEmailsTraverse() {
		hardwait(2000);
		WebElement searchBox= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBox_xpath")));
		searchBox.sendKeys("label: unread");
		hardwait(2000);
		WebElement searchBTN= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBTN_xpath")));
		searchBTN.click();
		hardwait(2000);
		List<WebElement>  next= driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
      //  System.out.println(next.size());
        next.get(1).click();
	}
	
	public void countUnreadMails() {
        hardwait(2000);
		List<WebElement>  unreadmailcount1= driver.findElements(By.xpath(PropertyReader.getPropValue("unreadmailcount_xpath")));
		//System.out.println(unreadmailcount1.size());
		System.out.println("Total no of unread mails are: "  + unreadmailcount1.get(3).getText());
	}
}
