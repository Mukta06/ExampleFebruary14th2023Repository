package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectScenario {


	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
		minimizeFlyoutWindow();
		createProject();
		deleteProject();

	}


	public static WebDriver browser = null;

	private static void launch() {

		try {
			System.setProperty("webdriver.chrome.driver",".\\Library\\Drivers\\chromedriver.exe");

			browser = new ChromeDriver();

			browser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			browser.get("http://localhost:81/login.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			browser.findElement(By.id("username")).sendKeys("admin");
			browser.findElement(By.name("pwd")).sendKeys("manager");
			browser.findElement(By.xpath("//div[text()='Login ']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyoutWindow() {
		try {
			browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createProject() {
		try {


			browser.findElement(By.xpath("//div[text()='TASKS']")).click();
			browser.findElement(By.xpath("//div[text()='Add New']")).click();
			browser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(5000);
			browser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Selenium_Automation");
			Thread.sleep(5000);
			
			browser.findElement(By.id("ext-gen23")).click();
			Thread.sleep(5000);
			browser.findElement(By.id("ext-gen104")).click();
			Thread.sleep(5000);
			browser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("SakshiS");
			Thread.sleep(5000);
			browser.findElement(By.id("projectPopup_projectDescriptionField"))
			.click();
			Thread.sleep(5000);
			browser.findElement(By.id("projectPopup_projectDescriptionField"))
			.sendKeys("Automation testing using Selenium");
			Thread.sleep(5000);
			browser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{

			e.printStackTrace();

		}
		
	}


	private static void deleteProject() 
	{
		try
		{ 
			browser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(1000);

			browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]"
				)).click(); 
			Thread.sleep(5000);
			browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(5000); 
			
			
			browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);	
			browser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			
		}
		catch(Exception e) 
		{ e.printStackTrace();

		} 
		
	}

}
