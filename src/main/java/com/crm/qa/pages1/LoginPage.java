package com.crm.qa.pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base1.TestPage;

public class LoginPage extends TestPage{
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement Login;
	
	/*@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement Login;*/
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage Login(String em,String pwd) {
	
		email.sendKeys(em);
		password.sendKeys(pwd);
		Login.click();
		
		return new HomePage();
	}
	
}
