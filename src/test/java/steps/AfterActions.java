package steps;

import com.stcroix.utils.BasePage;

import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public static void tearDown()
	{
		BasePage.tearDown();
	}

}