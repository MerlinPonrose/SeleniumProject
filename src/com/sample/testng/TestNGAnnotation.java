package com.sample.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	
public WebDriver driver;

@BeforeSuite
public void beforeSuite()
{
	System.out.println("Inside before suite");
}
	
@BeforeTest
public void launchURL()
{
	System.out.println("Inside before test");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); // maximizing the window
	driver.get("http://demo.automationtesting.in/Frames.html"); //Open URL
}

@BeforeClass
public void beforeClass()
{
	System.out.println("Inside before class");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("Inside before method");
}

@Test(enabled=false)
public void frame() throws InterruptedException
{
	System.out.println("Inside Test");
	System.out.println("priority 2");
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
}

@Test(groups = {"exclude"})
public void verifyElement()
{
	
	System.out.println("Inside test2");
	System.out.println("Priority 1");
	//driver.findElement(By.xpath("(//input[@type='text'])[1]")).isDisplayed();
}


@Test(priority=2)
public void verifyElements()
{
	
	System.out.println("Inside test2");
	System.out.println("Priority 3");
	//driver.findElement(By.xpath("(//input[@type='text'])[1]")).isDisplayed();
}

@Test(groups = {"smoke"})
public void verifyTest()
{
	System.out.println("Smoke test1");
}

@Test(groups = {"smoke"})
public void verifyTest2()
{
	System.out.println("Smoke test2");
}
	
@AfterTest
public void closeBrowser()
{
	System.out.println("Inside after test");
	driver.close();
}

@AfterSuite()
public void aftersuite()
{
	System.out.println("Inside after suite");
}

@AfterClass
public void afterclass()
{
	System.out.println("Inside after class");

}
	
@AfterMethod
public void aftermethod()
{
	System.out.println("Inside after method");
}
}
