package com.crm.qa.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base1.TestPage;
import com.crm.qa.pages1.HomePage;
import com.crm.qa.pages1.LoginPage;

public class LoginPageTest extends TestPage{
	
	LoginPage login;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 login=new LoginPage();
		
	}
	
	@Test(priority=2)
	public void LoginPageTitletest() {
		String title=login.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test(priority=1)
	public void LoginTest() {
		homepage=login.Login(prop.getProperty("email"),prop.getProperty("pwd"));
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
