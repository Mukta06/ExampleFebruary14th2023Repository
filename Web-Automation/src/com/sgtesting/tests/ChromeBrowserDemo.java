package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
 * Webdriver is the interface which is implemented by many
 * of the browsers like chrome,firefox,safari etc.
 * */

public class ChromeBrowserDemo {
	
	public static WebDriver Browser=null;
	
	
	
	private static void launchBrowser()
	{
		try
		{
			Browser=new ChromeDriver();
			
			/*
			 * If any exception occurs while opening chrome browser.
			 */
			//System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			
			/*
			 * If we get illegal state exception then need to download chrome driver file 
			 * then in try block add
			 * System.setProperty("webdriver.chrome.driver","D:\ExampleAutomation\Automation\Web-Automation\Library\Drivers\chromedriver.exe");
			 */
//			Browser=new FirefoxDriver();
//			Browser=new SafariDriver();
//			Browser=new EdgeDriver();
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
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try 
		{
			Browser.close();
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		closeApplication();
		

	}

}
