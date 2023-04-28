package com.sgtesting.SeleniumUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {

	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		
		launch();
		handleFrames();
	}
	
	private static void launch()
	{
		
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.get("file:///D:/ExampleAutomation/ParentFrame.html");
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void handleFrames()
	{
		try
		{
			boolean first=UtilitySelenium.getFrameControl(oBrowser,"first");
			if(first)
			{
				boolean second=UtilitySelenium.getFrameControl(oBrowser, "second");
				if(second)
				{
					oBrowser.findElement(By.id("uiduser1name1")).sendKeys("DemoUser1");
					oBrowser.findElement(By.id("pwd1pass1word1")).sendKeys("Welcome1");
				}
			}
		
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

}
}
 

