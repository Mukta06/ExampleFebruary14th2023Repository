package com.sgtesting.SeleniumUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
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
			boolean v1=UtilitySelenium.isFramePresent(oBrowser);
			if(v1)
			{
				System.out.println("Frames have found!!!");
				System.out.println(UtilitySelenium.getFrameCount(oBrowser));
			}
			else
			{
				System.out.println("Frames have not found");
			}
			
			WebElement oElement=oBrowser.findElement(By.xpath("//iframe[@title='All Packages']"));
			boolean status=UtilitySelenium.getFrameControl(oBrowser, oElement);
			if(status)
			{
				oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
