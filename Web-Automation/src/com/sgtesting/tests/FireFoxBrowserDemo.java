package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	
	public static WebDriver Browser=null;
	
	private static void openBrowser()
	{
		try 
		{
			Browser=new FirefoxDriver();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try 
		{
			Browser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void close()
	{
		try 
		{
			Browser.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	

	public static void main(String[] args)
	{
		openBrowser();
		navigate();
		close();
		

	}

}
