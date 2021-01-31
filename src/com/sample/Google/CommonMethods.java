package com.sample.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	
	WebDriver driver;
	
	
	
	public void click(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

}
