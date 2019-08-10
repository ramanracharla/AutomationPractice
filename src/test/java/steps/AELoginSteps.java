package steps;

import org.testng.Assert;

import com.stcroix.pages.actions.LoginPage;
import com.stcroix.utils.BasePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AELoginSteps extends BasePage {
	
	LoginPage login = new LoginPage();
	
	@Given("^I want to navigate the url$")
	public void i_want_to_navigate_the_url() throws Throwable {
	    
		login.getUrl();
	}

	@When("^I provide the valid username$")
	public void i_provide_the_valid_username() throws Throwable {
	    
	    login.getUserName();
	}

	@When("^I provide the valid password$")
	public void i_provide_the_valid_password() throws Throwable {
	    
	    login.getPassword();
	}

	@And("^click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
	    
	    login.clickLogin();
	}

	


}
