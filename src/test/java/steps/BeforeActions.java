package steps;

import com.stcroix.utils.BasePage;

import cucumber.api.java.Before;

public class BeforeActions {
	
    @Before
	public static void setUp()
	{
		BasePage.initConfiguration();
	}
}
