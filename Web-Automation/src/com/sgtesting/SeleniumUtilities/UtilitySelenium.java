package com.sgtesting.SeleniumUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilitySelenium
{
	/*
	 * Verify the existence of Frames in a web page
	 */
	public static boolean isFramePresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			List<WebElement> oFrames= oBrowser.findElements(By.tagName("iframe"));
			status=(oFrames.size()>0);
		}
		catch(Exception e)
		{
			status=false;

		}
		return status;
	}
	
	
	/*
	 * No of frames in given url.
	 */

	public static int getFrameCount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			List<WebElement> oFramesno=oBrowser.findElements(By.tagName("iframe"));
			count=oFramesno.size();
			
		}
		catch(Exception e)
		{
			count=-1;
		
		}
		return count;
	}
	
	
	/*
	 * Verify the existence of Frames in a web page
	 */
	public static boolean getFrameControl(WebDriver oBrowser,WebElement oElement)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(oElement);
			status=true;
		}
		
		catch(Exception e)
		{
			status=false;

		}
		return status;
	}
	
	
	public static boolean getFrameControl(WebDriver oBrowser,int index)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(index);
			status=true;
		}
		
		catch(Exception e)
		{
			status=false;

		}
		return status;
	}
	
	public static boolean getFrameControl(WebDriver oBrowser,String name)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(name);
			status=true;
		}
		
		catch(Exception e)
		{
			status=false;

		}
		return status;
	}
	
	
	/*
	 * Verify the existence of popup/child/tabbed browser
	 */
	
	public static boolean isPopUpPresent(WebDriver oBrowser)
	{
		boolean status =false;
		try
		{
			int count=oBrowser.getWindowHandles().size()-1;
			if(count>0)
			{
				status=true;
			}
			
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	
	/*
	 * Verify the pop up count
	 */
	
	public static int getPopUpCount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
		
	}
	
	/*
	 * Verify the Alert Existence
	 */
	
	public static boolean isAlertPresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().alert();
			status=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	/*
	 * Verify the alerts count
	 */
	public static int getAlertCount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			if(isAlertPresent(oBrowser))
			{
				count++;
			}
			

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	/*
	 * Verify existence of any GUI Element
	 * 
	 */
	
	public static boolean isGUIElementPresent(WebDriver oBrowser,By by)
	{
		boolean status =false;
		try
		{
			status=oBrowser.findElement(by).isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	
	
	






}
