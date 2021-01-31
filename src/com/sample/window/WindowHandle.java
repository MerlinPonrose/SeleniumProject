package com.sample.window;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.automationtesting.in/Windows.html"); //Open URL
		
		WebElement clickButton = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		clickButton.click();
		 
		
		
		String ParentWindow = driver.getWindowHandle();// it will return parent window
		Set<String> set = driver.getWindowHandles();// it will return number of opened windows by webdriver
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String childwindow = it.next();
			if(!ParentWindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement download = driver.findElement(By.xpath("//a[text()='Downloads']"));
				download.click();
				driver.close();
				
			}
			
		}
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
		
		

	}

}
