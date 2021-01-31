package com.sample.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Open URL
		WebElement AlertBoxButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		AlertBoxButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();// to click ok button in the alert

	}

}
