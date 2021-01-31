package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnumerators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstName.click();
		FirstName.sendKeys("Merlin");
		
		FirstName.sendKeys(Keys.chord(Keys.CONTROL,"a")); // for passing multiple keyboard operation
		FirstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	Thread.sleep(3000);
		
	 	FirstName.sendKeys(Keys.TAB);// keyboard operation
	
	WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
