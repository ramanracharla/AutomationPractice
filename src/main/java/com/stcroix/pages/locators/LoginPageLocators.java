package com.stcroix.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

	@FindBy(how=How.CSS, using="#txtUserName")
	public WebElement username;
	
	@FindBy(how=How.CSS, using="#txtPassword")
	public WebElement password;

	@FindBy(how=How.CSS, using="#cmdLogin")
	public WebElement Login;

	
}
