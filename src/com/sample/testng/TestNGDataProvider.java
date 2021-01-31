package com.sample.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	WebDriver driver;
	
	
	
	@Test(dataProvider="getData")
	public void dataProvider(String username, String password) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/SignIn.html"); //Open URL
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(5000);
		
		
	}
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "merlin1";
		data[0][1] = "passwors1";
		
		
		data[1][0] = "lavanya";
		data[1][1] = "password1";
		
		data[2][0] = "arun";
		data[2][1] = "password2";
				
		
		return data;
		
	}
	
}
