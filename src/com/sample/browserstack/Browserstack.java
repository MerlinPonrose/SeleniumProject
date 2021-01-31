package com.sample.browserstack;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstack {
	
	 public static final String AUTOMATE_USERNAME = "selemiumtest1";
	  public static final String AUTOMATE_ACCESS_KEY = "XqxiVqJVaAWEngzk3P8x";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Firefox");
		    caps.setCapability("browser_version", "75.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		   
		    
		    driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
			
			WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			FirstName.clear();
			FirstName.click();
			FirstName.sendKeys("Merlin");
		    
		    driver.quit();
		  }
		  
		  // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
		  public static void markTestStatus(String status, String reason, WebDriver driver) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
		  }
}
