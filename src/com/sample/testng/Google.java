package com.sample.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sample.Google.CommonMethods;
import com.sample.Google.HomePage;

public class Google {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HomePage googlepg = new HomePage();
	CommonMethods common = new CommonMethods();
	WebDriver driver;
	driver=null;
	
	googlepg.clicksearchBox();

	common.click(googlepg.searchBox);
	common.sendValue(googlepg.searchBox, "hello");
		

	}

}
