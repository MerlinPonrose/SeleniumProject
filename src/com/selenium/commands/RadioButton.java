package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement MaleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
		
		
		if(MaleRadioButton.isSelected()) //To check whether the radio button/ check is selected
		{
			System.out.println("Radio Button is already selected");
		}
		else
		{
			MaleRadioButton.click();
			System.out.println("Radio Button is  selected now");
		}

	}

}
