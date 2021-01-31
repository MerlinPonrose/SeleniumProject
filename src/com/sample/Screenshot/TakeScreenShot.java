package com.sample.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Windows.html"); //Open URL
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("e:\\Karen Amy\\Desktop\\screenshot.jpeg"));
		
		
	}

}
