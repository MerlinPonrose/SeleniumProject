package com.sample.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithText {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Open URL
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		String promptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']")).getText();
		if(promptBox.contains("prompt"))
		{
			System.out.println("Prompt is displayed");
		}
		
		String promptBox1 = driver.findElement(By.xpath("//button[@class='btn btn-info']")).getAttribute("class");
		System.out.println(promptBox1);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Merlin");
		alert.accept();
		
		String getValue = driver.findElement(By.id("demo1")).getText(); // for retriving text from web page
		System.out.println(getValue);

		
	}

}
