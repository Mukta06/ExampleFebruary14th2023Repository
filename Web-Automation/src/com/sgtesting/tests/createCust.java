package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createCust {
private static WebDriver oBrowser=null;
private static ActTimeProjCrea actpro=null;
	public static void main(String[] args) {
		lauchBrows();
		navigate();
		login();
		creatCust();
		DeletCust();
		logout();
	}
	public static void lauchBrows()
	{
		try
		{
		oBrowser=new ChromeDriver();
		actpro=new ActTimeProjCrea(oBrowser);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/user/submit_tt.do");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void login()
	{
		try {
			actpro.getUsername().sendKeys("admin");
			Thread.sleep(3000);
			actpro.getPassword().sendKeys("manager");
			Thread.sleep(3000);
			actpro.getLogin().click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void creatCust()
	{
		try {
			actpro.getClickTask().click();
			Thread.sleep(3000);
			actpro.getAddNew().click();
			Thread.sleep(3000);
			actpro.getClickNewCust().click();
			Thread.sleep(3000);
			actpro.createCust_name().sendKeys("deep");
			Thread.sleep(3000);
			actpro.getCreatCust().click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void DeletCust()
	{
		try {
			actpro.GetClicSetting().click();
			Thread.sleep(3000);
			actpro.getclicAction().click();
			Thread.sleep(3000);
			actpro.getclicDelet().click();
			Thread.sleep(3000);
			actpro.GetpermDelet().click();
			Thread.sleep(3000);
			} catch (Exception e) {
		e.printStackTrace();
		}
	}
		public static void logout()
		{
			try {
				actpro.getLogout();
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
