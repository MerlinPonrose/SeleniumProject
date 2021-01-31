package com.sample.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.guru99.com/test/drag_drop.html"); //Open URL
		
		WebElement sale = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement AccountTextbox = driver.findElement(By.id("loan"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sale, AccountTextbox).build().perform();
		
		
	}

}
