package com.sample.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement switchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).build().perform(); // Mouse Hover
		
	}

}
