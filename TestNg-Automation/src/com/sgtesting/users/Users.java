package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users 
{
	@Test
	public void createUser() 
	{
		System.out.println("DemoUser1 has been created successfully");
		
	}
	
	@Test
	public void deleteUser() 
	{
		System.out.println("DemoUser1 has been deleted successfully");
		
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
		System.out.println("===============================================");
	}

}
