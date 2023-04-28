package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage
{
	ActiPage(WebDriver browser)
	{
		PageFactory.initElements(browser,this);
	}
	
	private WebElement username;
	private WebElement pwd;
	@FindBy(xpath ="//div[text()='Login ']")private WebElement login;
	@FindBy(xpath="//div[text()='TASKS']")private WebElement Tasks;
	

	
}
