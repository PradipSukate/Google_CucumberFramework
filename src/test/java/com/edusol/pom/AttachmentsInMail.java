package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class AttachmentsInMail extends CommonMethods {
        public void findMailWithAttachments() {
	hardwait(2000);
	WebElement searchBox= driver.findElement(By.xpath(PropertyReader.getPropValue("search_xpath")));
	waitForClick(searchBox);
	searchBox.click();
	hardwait(2000);
	//searchBox.click();
	//WebElement hasAttachmentBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("hasAttachment_xpath")));
	//hasAttachmentBtn.click();
	WebElement advanceSearch= driver.findElement(By.xpath(PropertyReader.getPropValue("advanceSearch_xpath")));
	advanceSearch.click();
	List<WebElement> hasAttachmentsBtn= driver.findElements(By.xpath(PropertyReader.getPropValue("hasAttachments_xpath")));
	//waitForClick(hasAttachmentsBtn);
	hasAttachmentsBtn.get(0).click();;
	hardwait(2000);
	WebElement searchBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBtn_xpath")));
	searchBtn.click();
	hardwait(2000);
        }
        
        public void validationMailWithAttachments() {
        	List<WebElement> attachmentPin= driver.findElements(By.xpath(PropertyReader.getPropValue("attachmentPin_xpath")));
	        System.out.println(attachmentPin.get(1).getAttribute("title"));	
        }
}