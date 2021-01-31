package com.selenium.commands;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		int inputcount = driver.findElements(By.tagName("a")).size();
		System.out.println(inputcount);
		
		int labelCount = driver.findElements(By.tagName("label")).size();
		System.out.println(labelCount);
		
		List<WebElement> getLabelText = driver.findElements(By.tagName("label"));
		
		Iterator<WebElement> it = getLabelText.iterator();
		while(it.hasNext())
		{
			WebElement text = it.next();
			System.out.println(text.getText());
		}
		

	}

}
