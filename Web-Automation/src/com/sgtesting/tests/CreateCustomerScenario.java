package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomerScenario {
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		Login();
		minimizeFlyoutwindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		Logout();
		closeApplication();
		

	}


	public static WebDriver Browser=null;
	
	
	
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
	
	private static void createCustomer()
	{
		try
		{
			
			Browser.findElement(By.xpath("//div[text()='TASKS']")).click();
			
			Browser.findElement(By.xpath("//div[text()='Add New']")).click();
			Browser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("customerLightBox_nameField")).sendKeys("Sakshi");
			Thread.sleep(1000);
			Browser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Sakshi form banglore \n Working at Walmart, Banglore.");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
	}
	
	private static void deleteCustomer()
	{
		try
		{
			Browser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(1000);
			
			Browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);	
			Browser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	
	
	private static void modifyCustomer()
	{
		try
		{
			Browser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(1000);
			
			Browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
		    Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div")).click();
			Thread.sleep(3000);
			Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")).clear();
			Thread.sleep(1000);

			Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys("Keerti");
			Thread.sleep(2000);
			Browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
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

	
}

