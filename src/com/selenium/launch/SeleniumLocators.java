package com.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("https://www.google.com/"); //Open URL
		
		/*WebElement searchBox = driver.findElement(By.name("q"));*/
		WebElement searchBox = driver.findElement(By.tagName("input"));
		searchBox.click();
		
	//	WebElement signInButton = driver.findElement(By.id("gb_70"));
		WebElement signInButton = driver.findElement(By.partialLinkText("Ima"));
		signInButton.click();
		
		WebElement username = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		username.clear();
		username.click();
		username.sendKeys("merlin");
		
	}

}
