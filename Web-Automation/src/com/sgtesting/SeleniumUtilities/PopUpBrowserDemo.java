package com.sgtesting.SeleniumUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowserDemo {

public static WebDriver Browser=null;

public static void main(String[] args) 
{
	launchBrowser();
	navigate();
	HandlePopUps();
//	Login();
//	minimizeFlyoutwindow();
//	Logout();
//	closeApplication();
	

}

	
	
	
	private static void launchBrowser()
	{
		try
		{
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
			WebElement element=Browser.findElement(By.id("username"));
			element.sendKeys("admin");
			Thread.sleep(1000);
			Browser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			
			/*
			 * By.xpath is accepting string as a parameter
			 * value should  not contain double quotes if it contains
			 * then \"Login"\ is used to loose the character value""
			 * or //*[@id=\'loginButton']/div.
			 */
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
			Browser.findElement(By.className("gettingStartedShortcutsLabel")).click();
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
			
			Browser.findElement(By.id("logoutLink")).click();
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
	
	
	/*
	 * Handle pop ups
	 * 
	 */
	
	private static void HandlePopUps()
	{
		try
		{
			Browser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(1000);
			boolean v1=UtilitySelenium.isPopUpPresent(Browser);
			int count=UtilitySelenium.getPopUpCount(Browser);
			System.out.println("No of popups :"+count);
			if(v1)
			{
				System.out.println("Popup window is present");
			}
			else
			{
				System.out.println("Popup window is not present");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
