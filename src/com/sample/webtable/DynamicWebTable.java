package com.sample.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumCommands\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("http://demo.guru99.com/test/web-table-element.php"); //Open URL
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("row count ="+rowCount);
		for(int i=0;i<rowCount;i++)
		{
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			int colCount = col.size();
			System.out.println("column count ="+colCount);
			for(int j=0;j<colCount;j++)
			{
				String textValue = col.get(j).getText();
				System.out.println("Value from row "+i+" and col "+j+" is "+textValue+"");
			}
		}

	}

}
