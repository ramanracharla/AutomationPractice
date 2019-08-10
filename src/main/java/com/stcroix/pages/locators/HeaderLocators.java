package com.stcroix.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderLocators {
	
	@FindBy(how=How.LINK_TEXT, using="Logout")
	public WebElement logoutlink;

}
