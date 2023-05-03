package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users 
{
	@Test(priority=1)
	public void createUser() 
	{
		System.out.println("DemoUser1 has been created successfully");
		
	}
	
	@Test(priority=4,dependsOnMethods = "createUser")
	
	public void deleteUser() 
	{
		System.out.println("DemoUser1 has been deleted successfully");
		
	}
	
	@Test(priority=2)
	public void modifyUser() 
	{
		System.out.println("DemoUser1 has been modified successfully");
		
	}
	
	@Test(priority=3,dependsOnMethods = {"modifyUser","createUser"})
	public void addCustomer() 
	{
		System.out.println("Customer has been added successfully");
		
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
