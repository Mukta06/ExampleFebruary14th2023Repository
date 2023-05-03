package com.sgtesting.annotationsummary;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	//Instead of dataprovider name we can give method name also getCredentials
	@Test(dataProvider = "credentials")
	//@Test(dataProvider = )
	public void login(String username,String password)
	{
		System.out.println(username+"====="+password);
	}
	
	
	@DataProvider(name="credentials")
	public Object[][]getCredentials()
	{
		return new Object[][] {{"user1","welcome1"},{"user2","welcome2"},{"user3","welcome3"}};
	}

}
