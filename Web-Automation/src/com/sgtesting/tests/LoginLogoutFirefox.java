package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefox {

public static WebDriver Browser=null;
	
	
	
	private static void launchBrowser()
	{
		try
		{
			Browser=new FirefoxDriver();
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
			//Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			
			/*//div[text()='login ']---->manually wrtn xpath
			 * cross check this manually wrtn value in inspect window
			 * by clicking cntrl+F and paste the value it should point 
			 * to the particular value we are looking for 
			 */
			
			Browser.findElement(By.xpath("//div[text()='Login ']")).click();
			
			//Browser.findElement(By.cssSelector("#loginButton > div:nth-child(1)")).click();
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

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		Login();
		minimizeFlyoutwindow();
		Logout();
		closeApplication();
		

	}

}

