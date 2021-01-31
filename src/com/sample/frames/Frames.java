package com.sample.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Frames.html"); //Open URL
		Thread.sleep(5000);
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='singleframe']")); //By using webelement
		
		//driver.switchTo().frame(0);// by using index
		
		driver.switchTo().frame("SingleFrame"); // by using name 
		
		
	
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
		driver.switchTo().defaultContent(); // switch out of frame
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		
		


	}

}
