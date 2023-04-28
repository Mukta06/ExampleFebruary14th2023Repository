package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	static WebDriver oBrowser=new ChromeDriver();

	public static void main(String[] args) {
		
	}
	
	
	private static void makeStatusActivewhoIsPreviousToRahulDravid()
	{ 
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
		
	}
	
	private static void basedOnSalaryTextFieldGetTableAttribute()
	{
		WebElement oTable=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr[1]/ancestor::table"));
		System.out.println(oTable.getAttribute("id"));
	}
	
	private static void basedOnTableReferenceEnterSalaryFor5thRecord()
	{
		oBrowser.findElement(By.xpath("//table/descendant::tr[5]/td[6]/input")).sendKeys("240000");
	}

}
