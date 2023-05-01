package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products
{
	@Test
	public void createProduct()
	{
		System.out.println("DemoProduct1 is created successfully");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("DemoProduct is deleted successfully");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch browser, Navigate URL and Login into Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the application and close the browser");
	}

}
