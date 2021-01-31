package com.sample.testng;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test(groups = {"sanity"})
	public void Display()
	{
		System.out.println("display text");
	}
	
	@Test(enabled = false)
	public void Printtext()
	{
		System.out.println("Print text");
	}

	@Test(dependsOnMethods = {"Btext","Ctext"})
	public void Annotation()
	{
		System.out.println("annotation in testng");
	}

	@Test
	public void Btext()
	{
		System.out.println("Btext");
	}
	
	@Test
	public void Ctext()
	{
		System.out.println("Btext");
	}

}
