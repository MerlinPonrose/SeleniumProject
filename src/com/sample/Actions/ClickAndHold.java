package com.sample.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html"); //launch the URL
		driver.manage().window().maximize(); //Maximize
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement textF = driver.findElement(By.xpath("//li[text()='G']"));
		WebElement textL = driver.findElement(By.xpath("//li[text()='L']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(textF);
		Thread.sleep(3000);
		action.clickAndHold(textF);
		Thread.sleep(3000);
		action.release(textL).build().perform();

	}

}
