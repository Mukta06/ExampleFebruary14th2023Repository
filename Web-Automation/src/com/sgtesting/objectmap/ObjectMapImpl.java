package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMapImpl {
	Properties prop=null;

	public ObjectMapImpl(String filepath) 
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filepath);
			prop=new Properties();
			prop.load(fin);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locator=prop.getProperty(logicalname);
			System.out.println(locator);
			String locatorDetails[]=locator.split(";");
			String locatorname=locatorDetails[0];
			String locatotvalue=locatorDetails[1];
			switch(locatorname.toLowerCase())
			{
			case "id":
				by=By.id(locatotvalue);
				break;
				
			case "classname":
				by=By.className(locatotvalue);
				break;
				
			case "name":
				by=By.name(locatotvalue);
				break;
				
			case "xpath":
				by=By.xpath(locatotvalue);
				break;
				
			case "cssselector":
				by=By.cssSelector(locatotvalue);
				break;
				
			case "linktext":
				by=By.linkText(locatotvalue);
				break;
				
			case "tagname":
				by=By.tagName(locatotvalue);
				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
		
	}

}
