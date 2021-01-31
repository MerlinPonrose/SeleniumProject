package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement HockeyCheckBox = driver.findElement(By.xpath("//input[@value='Hockey']"));
		HockeyCheckBox.click();
		
		if(HockeyCheckBox.isSelected())
		{
			System.out.println("Deselect that option");
			HockeyCheckBox.click();
		}
		else
		{
			System.out.println("Option is not selected");
		}
		
		
		 	driver.close();

	}

}
