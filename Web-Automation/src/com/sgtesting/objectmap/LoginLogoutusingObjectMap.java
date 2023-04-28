package com.sgtesting.objectmap;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutusingObjectMap {
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		Login();
		minimizeFlyoutwindow();
		Logout();
		closeApplication();
		

	}
	
public static WebDriver Browser=null;
public static ObjectMapImpl om=null;

	
	
	
	private static void launchBrowser()
	{
		try
		{
			om=new ObjectMapImpl(".\\ObjectMap\\objectmap.properties");
			Browser=new ChromeDriver();
			Browser.manage().window().maximize();
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
			
			Thread.sleep(2000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try 
		{
			/*
			 * Findelement returns value of type webelement
			 * By obj=By.id("username");
			 * WebElement element=Browser.findElement(obj);-->passing return value as a parameter
			 */
			WebElement element=Browser.findElement(om.getLocator("loginpageusername"));
			element.sendKeys("admin");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			
			/*
			 * By.xpath is accepting string as a parameter
			 * value should  not contain double quotes if it contains
			 * then \"Login"\ is used to loose the character value""
			 * or //*[@id=\'loginButton']/div.
			 */
			Browser.findElement(om.getLocator("loginpageloginbutton")).click();
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutwindow()
	{
		try
		{
			Browser.findElement(om.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(5000);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Logout()
	{
		try
		{
			
			Browser.findElement(om.getLocator("homepagelogout")).click();
			Thread.sleep(1000);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try 
		{
			
			Browser.close();
			//Browser.quit();
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	

}
