package com.stcroix.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	public static void initConfiguration()
	{
	   if(Constants.browser.equals("chrome"))
			   {
		          System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		          driver = new ChromeDriver();
			   }else if(Constants.browser.equals("firefox"))
			   {
				   driver = new FirefoxDriver();
			   }
				   
	              driver.manage().window().maximize();
	}
	
	
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}
	

}
