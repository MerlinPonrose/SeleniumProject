package com.selenium.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("https://www.amazon.in/"); //Open URL
		String title =driver.getTitle();  // for getting title of the page
		System.out.println(title);
		if(title.contains("Amazon"))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
		driver.close();
		driver.quit();
			

	}

}
