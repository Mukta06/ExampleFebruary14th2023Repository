package com.sgtesting.objectmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserScenarioUsingObjectMap {

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

	private static void createUser()
	{
		try
		{
			Browser.findElement(om.getLocator("homepageuserclick")).click();
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("userpageclickadduser")).click();
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpagefirstname")).sendKeys("Mukta");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpagelastname")).sendKeys("B");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpageemail")).sendKeys("cbmukta06@gmail.com");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpageusername")).sendKeys("Sachi");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpagepassword")).sendKeys("Muktacb06");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("adduserpagepasswordCopy")).sendKeys("Muktacb06");
			Thread.sleep(1000);

			Browser.findElement(om.getLocator("adduserpagecreateuser")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			Browser.close();
			e.printStackTrace();

		}




	}

	private static void modifyUser()
	{
		try
		{
			Browser.findElement(om.getLocator("modifyhomepageuserclick")).click();
			Thread.sleep(1000);
			//			String text=Browser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[3]/div/span")).getText();
			//			System.out.println(text);
			Browser.findElement(om.getLocator("modifyclickonusername")).click();
			Thread.sleep(1000);

			Browser.findElement(om.getLocator("modifyuserpassword")).sendKeys("Muktacb123");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("modifyuserpasswordcopy")).sendKeys("Muktacb123");
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("modifyclicksavechanges")).click();
			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser()
	{
		try
		{
			Browser.findElement(om.getLocator("deletehomepageclickuser")).click();
			Thread.sleep(1000);

			Browser.findElement(om.getLocator("deleteusernamespan")).click();
			Thread.sleep(1000);
			Browser.findElement(om.getLocator("deleteclickdeleteuser")).click();
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
		modifyUser();
		deleteUser();
		Logout();
		closeApplication();


	}

}

