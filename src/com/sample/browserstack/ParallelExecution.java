package com.sample.browserstack;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	public static final String AUTOMATE_USERNAME = "selemiumtest1";
	  public static final String AUTOMATE_ACCESS_KEY = "XqxiVqJVaAWEngzk3P8x";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	
	 @Parameters({"os","os_version","browser","browser_version"})
	@Test
	public void browserStack(String os, String os_version, String browser, String browser_version) throws MalformedURLException
	{
		 
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", os_version);
		    caps.setCapability("browser", browser);
		    caps.setCapability("browser_version", browser_version);
		    caps.setCapability("os", os);
		   
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		   driver.get("https://google.com");
		  
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("BrowserStack");
		    element.submit();
		    System.out.println(driver.getTitle());
		    // Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page starts with 'BrowserStack'
		    if (driver.getTitle().substring(0,12).equals("BrowserStack")) {
		    	markTestStatus("passed","Yaay title matched!",driver);
		    }
		    else {
		    	markTestStatus("failed","Naay title did not match!",driver);
		    }
		    driver.quit();
		  }
		  
		  // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
		  public static void markTestStatus(String status, String reason, WebDriver driver) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
		  }
		} 
