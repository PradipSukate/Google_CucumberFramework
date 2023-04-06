package com.edusol.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class SearchMail extends CommonMethods {
     
	public void searchingMail(){
		
		hardwait(2000);
		WebElement searchBox= driver.findElement(By.xpath(PropertyReader.getPropValue("search_xpath")));
		waitForClick(searchBox);
		searchBox.click();
		searchBox.sendKeys("pradipsukate@gmail.com");
		hardwait(2000);
		WebElement searchBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("searchBTN_xpath")));
		searchBtn.click();
		hardwait(2000);
		WebElement from= driver.findElement(By.xpath(PropertyReader.getPropValue("from_xpath")));
		from.click();
		hardwait(2000);
		WebElement fromList1= driver.findElement(By.xpath(PropertyReader.getPropValue("fromList_xpath")));
	    fromList1.click();
	}
	
	public void specificMailList(){
		List<WebElement> search_Name= driver.findElements(By.name(PropertyReader.getPropValue("search_Name")));
		String str= search_Name.get(151).getAttribute("name");
		//List<WebElement> fromList1= driver.findElements(By.xpath(PropertyReader.getPropValue("searchList_xpath")));
		//String str= fromList1.get(1).getText();
		System.out.println("Showing all emails received from "+ str);
		//Assert.assertTrue(str.equalsIgnoreCase("Pradip Sukate"));
	}
}
