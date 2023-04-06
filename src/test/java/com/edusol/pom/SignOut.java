package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class SignOut extends CommonMethods{

	public void signout() {
		hardwait(3000);
		WebElement profileBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("profileBtn_xpath")));
		profileBtn.click();
		hardwait(2000);
		driver.switchTo().frame("account");
		hardwait(2000);
		WebElement signout= driver.findElement(By.xpath(PropertyReader.getPropValue("signout_xpath")));
		signout.click();
		hardwait(2000);
		WebElement removeAcc= driver.findElement(By.xpath(PropertyReader.getPropValue("removeAcc_xpath")));
		removeAcc.click();
		hardwait(2000);
		WebElement redBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("redBtn_xpath")));
		redBtn.click();
		hardwait(2000);
		List<WebElement> removeBtn= driver.findElements(By.xpath(PropertyReader.getPropValue("removeBtn_xpath")));
		removeBtn.get(1).click();
	}
	
	public void homePagereturns() {
		System.out.println("Title of homepage is: " + driver.getTitle());
	}
}
