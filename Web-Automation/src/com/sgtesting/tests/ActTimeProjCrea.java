package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeProjCrea {
	ActTimeProjCrea(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
private WebElement username;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement clicTask;
	public WebElement getClickTask()
	{
		return clicTask;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement ClicAddNew;
	public WebElement getAddNew()
	{
		return ClicAddNew;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement ClicNewCust;
	public WebElement getClickNewCust()
	{
		return ClicNewCust;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement createCust_name()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")private WebElement ClicCreatCust;
	public WebElement getCreatCust()
	{
		return ClicCreatCust;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clicSettig;
	public WebElement GetClicSetting()
	{
		return clicSettig;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")private WebElement clicAction;
	public WebElement getclicAction()
	{
		return clicAction;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")private WebElement clicDelet;
	public WebElement getclicDelet()
	{
		return clicDelet;
	}
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement permDelet;
	public WebElement GetpermDelet()
	{
		return permDelet;
	}
	@FindBy(linkText="Logout")
	
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

	}


