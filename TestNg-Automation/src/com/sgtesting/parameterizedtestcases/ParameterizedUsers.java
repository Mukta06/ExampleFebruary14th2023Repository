package com.sgtesting.parameterizedtestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class ParameterizedUsers 
{
	@Parameters(value="username")
	@Test
	public void createUser(String username) 
	{
		System.out.println(username+" has been created successfully");
		
	}
	
	@Parameters(value="username")
	@Test
	public void deleteUser(String username) 
	{
		System.out.println(username+" has been deleted successfully");
		
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
