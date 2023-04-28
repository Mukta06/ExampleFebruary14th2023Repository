package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenario {
	

public static WebDriver Browser=null;
	
	
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\Drivers\\chromedriver.exe");

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
	
	private static void createUser()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.name("firstName")).sendKeys("Mukta");
			Thread.sleep(1000);
			Browser.findElement(By.name("lastName")).sendKeys("B");
			Thread.sleep(1000);
			Browser.findElement(By.name("email")).sendKeys("cbmukta06@gmail.com");
			Thread.sleep(1000);
			Browser.findElement(By.name("username")).sendKeys("Sachi");
			Thread.sleep(1000);
			Browser.findElement(By.name("password")).sendKeys("Muktacb06");
			Thread.sleep(1000);
			Browser.findElement(By.name("passwordCopy")).sendKeys("Muktacb06");
			Thread.sleep(1000);
			
			Browser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			Browser.close();
			e.printStackTrace();
			
		}
		
		
		
		
	}
	
	private static void deleteUser()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			
			Browser.findElement(By.className("userNameSpan")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Browser.switchTo().alert().accept();
			Thread.sleep(1000);
			
			
		}
		catch(Exception e)
		{
			Browser.close();
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
		createUser();
		deleteUser();
		Logout();
		closeApplication();
		

	}

}
