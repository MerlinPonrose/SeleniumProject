package com.sample.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestNG {
	
	WebDriver driver;
	
	@Test
	public void launchGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("https://www.google.co.in/"); //Open URL
	}

	@Test
public void launchURL()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); // maximizing the window
	driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
}
	
	@Test
	public void launchURL1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("https://www.selenium.dev/"); //Open URL
	}
	
	@Test(invocationCount=5)
	public void invocationTest()
	{
		System.out.println("invocation count");
	}

}
