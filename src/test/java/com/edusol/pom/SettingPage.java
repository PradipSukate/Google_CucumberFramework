package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class SettingPage extends CommonMethods {
	
	public void gmailSetting() {
		hardwait(2000);
		WebElement setting= driver.findElement(By.xpath(PropertyReader.getPropValue("setting_xpath")));
		setting.click();
		WebElement allSetting= driver.findElement(By.xpath(PropertyReader.getPropValue("allSetting_xpath")));
		allSetting.click();
		waitForClick(allSetting);	
	}
	
	public void settingdashboard() {
		WebElement settingDashboard= driver.findElement(By.xpath(PropertyReader.getPropValue("settingDashboard_xpath")));
		waitForDisplay(settingDashboard);
		String str= settingDashboard.getText();
		System.out.println(str + " page showing on display");
		
	}
	
	
	
	
	

}
