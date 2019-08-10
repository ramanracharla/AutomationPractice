package com.stcroix.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.stcroix.pages.locators.LoginPageLocators;
import com.stcroix.utils.BasePage;
import com.stcroix.utils.Constants;

public class LoginPage extends BasePage {
	
	public LoginPageLocators login;
	
	public LoginPage()
	{
		this.login = new LoginPageLocators();
		AjaxElementLocatorFactory Factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(Factory, this.login);
	}
	
	
	public void getUrl()
	{
		
		driver.get(Constants.url);
		
	}
	
	public void getUserName()
	{
		login.username.sendKeys(Constants.username);
	}
	
    public void getPassword()
    {
    	login.password.sendKeys(Constants.password);
    }
    
    public void clickLogin()
    {
    	login.Login.click();
    }
}
