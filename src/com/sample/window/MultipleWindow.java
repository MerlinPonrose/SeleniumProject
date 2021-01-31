package com.sample.window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Windows.html"); //Open URL
		
		driver.findElement(By.partialLinkText("Open Seperate Multiple Windows")).click();
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> array = new ArrayList<>(set);
		driver.switchTo().window(array.get(2));
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();		
		driver.switchTo().window(parentwindow);
		//driver.switchTo().window(array.get(1));
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	//	driver.quit();

	}

}
