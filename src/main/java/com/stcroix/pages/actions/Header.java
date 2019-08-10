package com.stcroix.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.stcroix.pages.locators.HeaderLocators;
import com.stcroix.utils.BasePage;
import com.stcroix.utils.Constants;

public class Header extends BasePage {
	
	public HeaderLocators header;
	
	public Header()
	{
		this.header = new HeaderLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.header);
	}
	
	public void verifyHomePageTitle()
	{
	    String homePageTitle = driver.getTitle();
	    Assert.assertEquals(homePageTitle, Constants.homePageTitle);
	    log.debug("Home Page Title matched");
	    
	}
	
	
	public void logout()
	{
		header.logoutlink.click();
	}
	
	public void verifyLoginPageTitle()
	{
	    String loginPageTitle = driver.getTitle();
	    Assert.assertEquals(loginPageTitle, Constants.loginPageTitle);
	    log.debug("Login Page Title matched");
	    
	}

}
