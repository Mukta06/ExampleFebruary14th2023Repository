package com.sgtesting.annotationsummary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationSummary
{
	
	@Test
	public void method1()
	{
		System.out.println("This is @Test Annotation method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is @Test Annotation method2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is @BeforeMethod annotation");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is @AfterMethod annotation");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is @AfterClass annotation");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is @BeforeClass annotation");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is @BeforeSuite annotation");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is @AfterSuite annotation");
	}
	
	

}
