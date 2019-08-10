package steps;

import com.stcroix.pages.actions.Header;
import com.stcroix.pages.actions.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LogoutSteps {
	
	LoginPage login = new LoginPage();
	Header header = new Header();
	
	@Given("^Verify Login$")
	public void verify_the_Page_title() throws Throwable {
	    
	    login.getUrl();
	    login.getUserName();
	    login.getPassword();
	    login.clickLogin();
		
	}
	
	@Then("^Verify the Home page title$")
	public void verify_the_Home_page_title() throws Throwable {
	    
		header.verifyHomePageTitle();
	}

	@And("^click on logout link$")
	public void click_on_logout_link() throws Throwable {
	    
	    header.logout();
	}
	
	
	

	@Then("^Verify the Login page title$")
	public void verify_the_page_title() throws Throwable {
	    
	    header.verifyLoginPageTitle();
	}

}
