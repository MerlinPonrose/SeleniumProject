package com.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstName.clear();
		FirstName.click();
		FirstName.sendKeys("Merlin");
		

	}

}
