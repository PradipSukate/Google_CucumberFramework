package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class ComposeEmail extends CommonMethods {
	
	public void mailCompose() {
		hardwait(2000);
     WebElement composeEmail= driver.findElement(By.xpath(PropertyReader.getPropValue("composeBtn_xpath")));
     composeEmail.click();
     hardwait(4000);
     waitForClick(composeEmail);
    WebElement toTextBox_xpath= driver.findElement(By.xpath(PropertyReader.getPropValue("toTextBox_containsxpath")));
     toTextBox_xpath.sendKeys("pradipsukate@gmail.com");
     hardwait(2000);
    WebElement ccBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("ccBtn_xpath")));
    ccBtn.click();;
    hardwait(3000);
   WebElement CcTextBox= driver.findElement(By.xpath(PropertyReader.getPropValue("CcTextBox_xpath")));
  // CcTextBox.click();
    CcTextBox.sendKeys("priyalawande@gmail.com");
     hardwait(2000);
     WebElement Subject= driver.findElement(By.xpath(PropertyReader.getPropValue("Subject_xpath")));
     Subject.sendKeys("Test Email-3");
     hardwait(2000);
     WebElement sendBtn= driver.findElement(By.xpath(PropertyReader.getPropValue("sendBtn_xpath")));
     sendBtn.click();
    // hardwait(2000);
   //  WebElement sent= driver.findElement(By.xpath(PropertyReader.getPropValue("sent_xpath")));
   //  sent.click();
    // String text=driver.findElements(By.xpath(PropertyReader.getPropValue("latestMail_xpath"))).get(1).getText();
     //System.out.println(text);
	}
	
	
	  public void sentMailVerify() {
		  hardwait(2000);
		  WebElement sent= driver.findElement(By.xpath(PropertyReader.getPropValue("sent_xpath")));
          sent.click();
		  hardwait(2000);
		  String  text=driver.findElements(By.xpath(PropertyReader.getPropValue("latestMail_xpath"))).get(1).getText();
		  System.out.println("Subject of latest email is: " + text);
	  
	  }
	 
	
	
   
}
